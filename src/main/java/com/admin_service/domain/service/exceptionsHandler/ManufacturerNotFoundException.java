package com.admin_service.domain.service.exceptionsHandler;


public class ManufacturerNotFoundException extends RuntimeException{
    public ManufacturerNotFoundException(Integer id) {
        super("Could not find manufacturer " + id);
    }

    }
