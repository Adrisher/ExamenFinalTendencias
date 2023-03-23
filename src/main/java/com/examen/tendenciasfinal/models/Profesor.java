package com.examen.tendenciasfinal.models;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Profesor")
public class Profesor {

    private Long idProfesor;


    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion;

    private Asignatura asignatura;
    private Ciclo ciclo;



}
