package com.examen.tendenciasfinal.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Ciclo")
public class Ciclo {

    private Long idCiclo;

    private String nombreCiclo;
    private String descripcion;

    private Carrera carrera;
}
