package com.admin_service.rest;

import com.admin_service.domain.service.ManufacturersService;
import com.admin_service.domain.service.ModelsService;
import com.admin_service.rest.dto.ManufacturerDTO;
import com.admin_service.rest.dto.ModelDTO;
import com.admin_service.domain.model.Manufacturer;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController()
@RequestMapping("/manufacturers")
public class ManufacturersController {

    private final ManufacturersService manufacturersService;
    private final ModelsService modelsService;

    public ManufacturersController(ManufacturersService manufacturersService, ModelsService modelsService) {
        this.manufacturersService = manufacturersService;
        this.modelsService = modelsService;
    }


    @PostMapping
    public ManufacturerDTO createManufacturer(@RequestBody ManufacturerDTO manufacturerDTO) {
        Manufacturer manufacturer = manufacturersService.createManufacturer(manufacturerDTO.toModel());

        return ManufacturerDTO.fromModel(manufacturer);
    }

    @GetMapping()
    public List<ManufacturerDTO> getManufacturers() {
        List<Manufacturer> manufacturers = manufacturersService.getManufacturers();

        return manufacturers.stream()
                .map(ManufacturerDTO::fromModel)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ManufacturerDTO getManufacturer(@PathVariable Integer id) {
        Manufacturer manufacturer = manufacturersService.getManufacturer(id);

        return ManufacturerDTO.fromModel(manufacturer);
    }

    @PutMapping("/{id}")
    public ManufacturerDTO updateManufacturer(@PathVariable Integer id, @RequestBody ManufacturerDTO manufacturerDTO) {
        Manufacturer manufacturer = manufacturersService.updateManufacturer(id, manufacturerDTO.toModel());

        return ManufacturerDTO.fromModel(manufacturer);
    }

    @DeleteMapping("/{id}")
    public void deleteManufacturer(@PathVariable Integer id) {
        manufacturersService.deleteManufacturer(id);
    }

    @GetMapping("/{manufacturerId}/models")
    public List<ModelDTO> getModelsByManufacturerId(@PathVariable Integer manufacturerId) {

        return modelsService.getModelsByManufacturerId(manufacturerId).stream()
                .map(ModelDTO::fromModel)
                .collect(Collectors.toList());
    }

}
