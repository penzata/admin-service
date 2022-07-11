package com.karucabg.demo.domain.service.impl;

import com.karucabg.demo.domain.model.Model;
import com.karucabg.demo.domain.service.ModelsService;
import com.karucabg.demo.persistence.repository.ModelRepository;

import java.util.HashSet;

public class ModelsServiceImpl implements ModelsService {

    private ModelRepository modelRepository;

    @Override
    public HashSet<Model> getModels() {

        return modelRepository.findALl();
    }
}
