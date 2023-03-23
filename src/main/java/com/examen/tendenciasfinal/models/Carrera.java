package com.examen.tendenciasfinal.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Carrera")
public class Carrera {

    private Long idCarrera;

    private String nombreCarrera;
    private String descripcion;

    private Periodo periodo;
}
