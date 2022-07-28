package com.karucabg.demo.rest.exceptionsHandler;

public class ModelNotFoundException extends RuntimeException{
    public ModelNotFoundException(Integer id) {
        super("Could not find model " + id);

    }
}
