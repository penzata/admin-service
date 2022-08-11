package com.karucabg.demo.domain.service;

import com.karucabg.demo.domain.model.Model;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

public interface ModelsService {

    Model createModel(Model toModel);

    Model getModel(Integer id);

    List<Model> getModels();

    List<Model> getModelsByManufacturerId(Integer manufacturerId);

    Model updateModel(Integer id, Model model);

    void deleteModel(Integer id);
}
