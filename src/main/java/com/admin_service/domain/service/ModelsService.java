package com.admin_service.domain.service;

import com.admin_service.domain.model.Model;

import java.util.List;

public interface ModelsService {

    Model createModel(Model toModel);

    Model getModel(Integer id);

    List<Model> getModels();

    List<Model> getModelsByManufacturerId(Integer manufacturerId);

    Model updateModel(Integer id, Model model);

    void deleteModel(Integer id);
}
