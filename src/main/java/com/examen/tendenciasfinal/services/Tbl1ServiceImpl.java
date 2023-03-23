package com.examen.tendenciasfinal.services;

import com.examen.tendenciasfinal.models.Tbl1;
import com.examen.tendenciasfinal.repository.Tbl1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class Tbl1ServiceImpl extends GenericServiceImpl<Tbl1, Long> implements Tbl1Service{

    @Autowired
    private Tbl1Repository tbl1Repository;
    @Override
    public CrudRepository<Tbl1, Long> getDao() {
        return tbl1Repository;
    }
}
