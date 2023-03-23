package com.examen.tendenciasfinal.controllers;


import com.examen.tendenciasfinal.models.Tbl1;
import com.examen.tendenciasfinal.services.Tbl1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persona")
public class Tbl1Controller {
    @Autowired
    Tbl1Service tbl1Service;

    @GetMapping("/listar")
    public ResponseEntity<List<Tbl1>> listarProductos() {
        return new ResponseEntity<>(tbl1Service.findByAll(),
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Tbl1> crearProducto(
            @RequestBody Tbl1 p) {
        return new ResponseEntity<>(tbl1Service.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Tbl1> actualizarProducto(@PathVariable Long id, @RequestBody Tbl1 p) {
        Tbl1 personaENcontrada = tbl1Service.findById(id);
        if (personaENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                //personaENcontrada.setNombre(p.getNombre());
                //personaENcontrada.setApellido(p.getApellido());
                //personaENcontrada.setDireccion(p.getDireccion());
                return new ResponseEntity<>(tbl1Service.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Tbl1> eliminarProducto(@PathVariable Long id) {
        tbl1Service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
