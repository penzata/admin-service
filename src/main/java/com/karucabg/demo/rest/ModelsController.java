package com.karucabg.demo.rest;

import com.karucabg.demo.domain.model.Manufacturer;
import com.karucabg.demo.domain.model.Model;
import com.karucabg.demo.domain.service.ModelsService;
import com.karucabg.demo.rest.dto.ManufacturerDTO;
import com.karucabg.demo.rest.dto.ModelDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/models")
public class ModelsController {

    private final ModelsService modelsService;

    public ModelsController(ModelsService modelsService) {

        this.modelsService = modelsService;
    }

    @GetMapping()
    public List<ModelDTO> getModels() {

        return modelsService.getModels().stream()
                .map(ModelDTO::fromModel)
        .collect(Collectors.toList());
    }

    }
