package com.karucabg.demo.rest.dto;

import com.karucabg.demo.domain.model.Manufacturer;

import java.util.UUID;

public record ManufacturerDTO(UUID id,
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
