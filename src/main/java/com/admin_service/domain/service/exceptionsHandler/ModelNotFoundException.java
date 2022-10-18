package com.admin_service.domain.service.exceptionsHandler;


public class ModelNotFoundException extends RuntimeException{
    public ModelNotFoundException(Integer id) {
        super("Could not find model " + id);
    }

    }
