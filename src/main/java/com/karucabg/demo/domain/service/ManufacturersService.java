package com.karucabg.demo.domain.service;


import com.karucabg.demo.domain.model.Manufacturer;

import java.util.List;

public interface ManufacturersService {
    Manufacturer createManufacturer(Manufacturer manufacturer);

    Manufacturer getManufacturer(Integer id);

    List<Manufacturer> getManufacturers();

    Manufacturer updateManufacturer(Integer id, Manufacturer manufacturer);

    void deleteManufacturer(Integer id);
}
