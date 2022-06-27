package com.karucabg.demo.domain.service.impl;


import com.karucabg.demo.domain.model.Manufacturer;
import com.karucabg.demo.domain.service.ManufacturersService;
import com.karucabg.demo.persistence.repository.ManufacturerRepository;
import org.springframework.stereotype.Service;

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
                .orElseThrow(() -> new RuntimeException("Manufacturer not found "));
    }
}
