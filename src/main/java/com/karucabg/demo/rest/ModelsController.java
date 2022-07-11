package com.karucabg.demo.rest;

import com.karucabg.demo.domain.model.Manufacturer;
import com.karucabg.demo.domain.model.Model;
import com.karucabg.demo.domain.service.ModelsService;
import com.karucabg.demo.rest.dto.ManufacturerDTO;
import com.karucabg.demo.rest.dto.ModelDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/models")
public class ModelsController {

    private final ModelsService modelsService;

    public ModelsController(ModelsService modelsService) {

        this.modelsService = modelsService;
    }

    @GetMapping()
    public HashSet<ModelDTO> getModels() {
        HashSet<Model> models = (HashSet<Model>) modelsService.getModels();

        return (HashSet<ModelDTO>) models.stream()
                .map(ModelDTO::fromModel)
        .collect(Collectors.toList());

    }


}
