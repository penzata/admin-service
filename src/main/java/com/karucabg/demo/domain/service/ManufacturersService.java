package com.karucabg.demo.domain.service;


import com.karucabg.demo.domain.model.Manufacturer;

public interface ManufacturersService {
    Manufacturer createManufacturer(Manufacturer manufacturer);

    Manufacturer getManufacturer(Integer id);
}
