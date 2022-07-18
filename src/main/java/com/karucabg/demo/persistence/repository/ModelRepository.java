package com.karucabg.demo.persistence.repository;

import com.karucabg.demo.domain.model.Model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;

@Repository
public interface ModelRepository extends CrudRepository<Model, Integer> {

    List<Model> findAll();
}
