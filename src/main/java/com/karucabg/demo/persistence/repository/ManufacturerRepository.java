package com.karucabg.demo.persistence.repository;

import com.karucabg.demo.domain.model.Manufacturer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends CrudRepository<Manufacturer, Integer> {

}
