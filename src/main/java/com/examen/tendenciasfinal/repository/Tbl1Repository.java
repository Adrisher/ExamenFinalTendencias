package com.examen.tendenciasfinal.repository;

import com.examen.tendenciasfinal.models.Tbl1;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tbl1Repository extends MongoRepository<Tbl1, Long> {

}
