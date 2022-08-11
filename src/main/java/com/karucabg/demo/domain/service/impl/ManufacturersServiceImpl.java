package com.karucabg.demo.domain.service.impl;


import com.karucabg.demo.domain.model.Manufacturer;
import com.karucabg.demo.domain.service.ManufacturersService;
import com.karucabg.demo.persistence.repository.ManufacturerRepository;
import com.karucabg.demo.rest.exceptionsHandler.ManufacturerNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturersServiceImpl implements ManufacturersService {

    private final ManufacturerRepository manufacturerRepository;

    public ManufacturersServiceImpl(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public Manufacturer createManufacturer(Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

    @Override
    public Manufacturer getManufacturer(Integer id) {
        return manufacturerRepository.findById(id)
                .orElseThrow(() -> new ManufacturerNotFoundException(id));
    }

    @Override
    public List<Manufacturer> getManufacturers() {
        return manufacturerRepository.findAll();
    }

    @Override
    public Manufacturer updateManufacturer(Integer id, Manufacturer manufacturer) {
        Manufacturer manufacturerToUpdate = manufacturerRepository.findById(id)
                .orElseThrow(() -> new ManufacturerNotFoundException(id));

        manufacturerToUpdate.setAddress(manufacturer.getAddress());
        manufacturerToUpdate.setName(manufacturer.getName());
        manufacturerToUpdate.setCountry(manufacturer.getCountry());

        return manufacturerRepository.save(manufacturerToUpdate);
    }

    @Override
    public void deleteManufacturer(Integer id) {
        manufacturerRepository.deleteById(id);
    }
}
