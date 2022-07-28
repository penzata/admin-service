package com.karucabg.demo.domain.service;

import com.karucabg.demo.domain.model.Model;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

public interface ModelsService {

    Model getModel(Integer id);
    List<Model> getModels();
    }
