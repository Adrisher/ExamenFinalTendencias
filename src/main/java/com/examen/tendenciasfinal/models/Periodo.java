package com.examen.tendenciasfinal.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Periodo")
public class Periodo {

    private Long idPeriodo;

    private String periodo;
    private Integer year;

}
