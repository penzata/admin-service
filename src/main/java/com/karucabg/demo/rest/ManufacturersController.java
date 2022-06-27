package com.karucabg.demo.rest;

import com.karucabg.demo.domain.model.Manufacturer;
import com.karucabg.demo.domain.service.ManufacturersService;
import com.karucabg.demo.rest.dto.ManufacturerDTO;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/manufacturers")
public class ManufacturersController {

    private final ManufacturersService manufacturersService;

    public ManufacturersController(ManufacturersService manufacturersService) {
        this.manufacturersService = manufacturersService;
    }


    @PostMapping
    public ManufacturerDTO createManufacturer(@RequestBody ManufacturerDTO manufacturerDTO) {
        Manufacturer manufacturer = manufacturersService.createManufacturer(manufacturerDTO.toModel());

        return ManufacturerDTO.fromModel(manufacturer);
    }

    @GetMapping("/{id}")
    public ManufacturerDTO getManufacturer(@PathVariable Integer id) {
        Manufacturer manufacturer = manufacturersService.getManufacturer(id);

        return ManufacturerDTO.fromModel(manufacturer);
    }
}
