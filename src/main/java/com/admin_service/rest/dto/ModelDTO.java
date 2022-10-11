package com.admin_service.rest.dto;

import com.admin_service.domain.model.Model;

public record ModelDTO(Integer id,
                       Integer manufacturerId,
                       String name) {


    public Model toModel() {
        return new Model(id, manufacturerId, name);
    }
    public static ModelDTO fromModel(Model model) {

        return new ModelDTO(model.getId(),
                model.getManufacturerId(),
                model.getName());
    }

}

