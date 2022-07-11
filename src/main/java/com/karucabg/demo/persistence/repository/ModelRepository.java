package com.karucabg.demo.persistence.repository;

import com.karucabg.demo.domain.model.Model;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public interface ModelRepository {
    HashSet<Model> findALl();
}
