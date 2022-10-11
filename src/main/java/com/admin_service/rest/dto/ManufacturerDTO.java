package com.admin_service.rest.dto;

import com.admin_service.domain.model.Manufacturer;

public record ManufacturerDTO(Integer id,
                              String name,
                              String address,
                              String country) {

    public Manufacturer toModel() {
        return new Manufacturer(id, name, address, country);
    }

    public static ManufacturerDTO fromModel(Manufacturer manufacturer) {
        return new ManufacturerDTO(manufacturer.getId(),
                manufacturer.getName(),
                manufacturer.getAddress(),
                manufacturer.getCountry());
    }
}
