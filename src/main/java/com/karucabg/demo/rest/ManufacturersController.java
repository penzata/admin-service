package com.karucabg.demo.rest;

import com.karucabg.demo.domain.model.Manufacturer;
import com.karucabg.demo.domain.service.ManufacturersService;
import com.karucabg.demo.rest.dto.ManufacturerDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/manufacturers")
public class ManufacturersController {

    private final ManufacturersService manufacturersService;

    public ManufacturersController(ManufacturersService manufacturersService) {
        this.manufacturersService = manufacturersService;
    }


    @PostMapping
    public ManufacturerDTO createManufacturer(ManufacturerDTO manufacturerDTO) {
        Manufacturer manufacturer = manufacturersService.createManufacturer(manufacturerDTO.toModel());

        return ManufacturerDTO.fromModel(manufacturer);
    }
}
