package com.examen.tendenciasfinal.controllers;


import com.examen.tendenciasfinal.models.Profesor;
import com.examen.tendenciasfinal.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {
    @Autowired
    ProfesorService profesorService;

    @GetMapping("/listar")
    public ResponseEntity<List<Profesor>> listDatos() {
        return new ResponseEntity<>(profesorService.findByAll(),
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Profesor> createDatos(
            @RequestBody Profesor p) {
        return new ResponseEntity<>(profesorService.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Profesor> updateDatos(@PathVariable Long id, @RequestBody Profesor p) {
        Profesor teacher = profesorService.findById(id);
        if (teacher == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                teacher.setNombre(p.getNombre());
                teacher.setApellido(p.getApellido());
                teacher.setCorreo(p.getCorreo());
                teacher.setCelular(p.getCelular());
                teacher.setDireccion(p.getDireccion());
                teacher.setAsignatura(p.getAsignatura());
                teacher.setCiclo(p.getCiclo());
                return new ResponseEntity<>(profesorService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Profesor> deleteDatos(@PathVariable Long id) {
        profesorService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
