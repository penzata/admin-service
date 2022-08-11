package com.karucabg.demo.domain.service.impl;

import com.karucabg.demo.domain.model.Model;
import com.karucabg.demo.domain.service.ModelsService;
import com.karucabg.demo.persistence.repository.ModelRepository;
import com.karucabg.demo.rest.exceptionsHandler.ManufacturerNotFoundException;
import com.karucabg.demo.rest.exceptionsHandler.ModelNotFoundException;
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
