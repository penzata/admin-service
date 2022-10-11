package com.admin_service.domain.service.impl;

import com.admin_service.domain.model.Model;
import com.admin_service.domain.service.ModelsService;
import com.admin_service.persistence.repository.ModelRepository;
import com.admin_service.rest.exceptionsHandler.ModelNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelsServiceImpl implements ModelsService {

    private final ModelRepository modelRepository;

    public ModelsServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public Model createModel(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public Model getModel(Integer id) {
        return modelRepository.findById(id)
                .orElseThrow(() -> new ModelNotFoundException(id));
    }

    @Override
    public List<Model> getModels() {

        return modelRepository.findAll();
    }

    @Override
    public List<Model> getModelsByManufacturerId(Integer manufacturerId) {
        return modelRepository.findByManufacturerId(manufacturerId);
    }

    @Override
    public Model updateModel(Integer id, Model model) {
        Model modelToUpdate = modelRepository.findById(id)
                .orElseThrow(() -> new ModelNotFoundException(id));

        modelToUpdate.setId(model.getId());
        modelToUpdate.setManufacturerId(model.getManufacturerId());
        modelToUpdate.setName(model.getName());

        return modelRepository.save(modelToUpdate);
    }

    @Override
    public void deleteModel(Integer id) {
        modelRepository.deleteById(id);
    }

}
