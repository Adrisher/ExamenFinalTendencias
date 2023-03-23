package com.examen.tendenciasfinal.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Asignatura")
public class Asignatura {

    private Long idAsignatura;

    private String nombreAsignatura;
    private Integer numHoras;
    private Integer numHorasPracticas;
    private Integer numHorasAutonomas;



}
