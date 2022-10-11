package com.admin_service.rest.exceptionsHandler;


public class ModelNotFoundException extends RuntimeException{
    public ModelNotFoundException(Integer id) {
        super("Could not find model " + id);
    }

    }
