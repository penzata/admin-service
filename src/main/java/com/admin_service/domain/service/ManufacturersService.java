package com.admin_service.domain.service;


import com.admin_service.domain.model.Manufacturer;

import java.util.List;

public interface ManufacturersService {
    Manufacturer createManufacturer(Manufacturer manufacturer);

    Manufacturer getManufacturer(Integer id);

    List<Manufacturer> getManufacturers();

    Manufacturer updateManufacturer(Integer id, Manufacturer manufacturer);

    void deleteManufacturer(Integer id);
}
