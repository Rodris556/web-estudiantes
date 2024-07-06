package com.univerm.student.repository;

import com.univerm.student.entity.EstudianteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Estudianterepository
    extends CrudRepository<EstudianteEntity, Integer>{}
