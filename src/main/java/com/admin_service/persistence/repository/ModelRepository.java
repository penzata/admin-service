package com.admin_service.persistence.repository;

import com.admin_service.domain.model.Model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends CrudRepository<Model, Integer> {


    List<Model> findAll();

    List<Model> findByManufacturerId(Integer manufacturerId);

}
