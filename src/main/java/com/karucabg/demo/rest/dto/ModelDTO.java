package com.karucabg.demo.rest.dto;

import com.karucabg.demo.domain.model.Model;

public record ModelDTO(Integer id,
                       Integer manufacturerId,
                       String name) {

    public static ModelDTO fromModel(Model model) {

        return new ModelDTO(model.getId(),
                model.getManufacturerId(),
                model.getName());
    }

}

