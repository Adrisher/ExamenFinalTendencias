package com.examen.tendenciasfinal.repository;

import com.examen.tendenciasfinal.models.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends MongoRepository<Profesor, Long> {

}
