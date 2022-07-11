package com.karucabg.demo.domain.service.impl;

import com.karucabg.demo.domain.model.Model;
import com.karucabg.demo.domain.service.ModelsService;
import com.karucabg.demo.persistence.repository.ModelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelsServiceImpl implements ModelsService {

    private final ModelRepository modelRepository;

    public ModelsServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public List<Model> getModels() {

        return modelRepository.findAll();
    }

}
