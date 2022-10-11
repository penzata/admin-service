package com.admin_service.rest;

import com.admin_service.domain.model.Model;
import com.admin_service.domain.service.ModelsService;
import com.admin_service.rest.dto.ModelDTO;
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

    @PostMapping
    public ModelDTO createModel(@RequestBody ModelDTO modelDTO) {
        Model model = modelsService.createModel(modelDTO.toModel());

        return ModelDTO.fromModel(model);
    }

    @GetMapping("/{id}")
    public ModelDTO getModel(@PathVariable Integer id) {

        return ModelDTO.fromModel(modelsService.getModel(id));
    }

    @GetMapping()
    public List<ModelDTO> getModels() {

        return modelsService.getModels().stream()
                .map(ModelDTO::fromModel)
        .collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public ModelDTO updateModel(@PathVariable Integer id, @RequestBody ModelDTO modelDTO) {
        Model model = modelsService.updateModel(id, modelDTO.toModel());

        return ModelDTO.fromModel(model);
    }

    @DeleteMapping("/{id}")
    public void deleteModel(@PathVariable Integer id) {
        modelsService.deleteModel(id);
    }


    }
