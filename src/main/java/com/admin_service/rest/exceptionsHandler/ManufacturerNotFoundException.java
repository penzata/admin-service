package com.admin_service.rest.exceptionsHandler;


public class ManufacturerNotFoundException extends RuntimeException{
    public ManufacturerNotFoundException(Integer id) {
        super("Could not find manufacturer " + id);
    }

    }
