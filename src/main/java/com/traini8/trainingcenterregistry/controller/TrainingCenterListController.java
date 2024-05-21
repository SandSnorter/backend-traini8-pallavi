package com.traini8.trainingcenterregistry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traini8.trainingcenterregistry.model.TrainingCenter;

import java.util.List;

@RestController
public class TrainingCenterListController {

    @Autowired
    private TrainingCenterRepository trainingCenterRepository;
    
    @GetMapping("/trainingcenters")
    public List<TrainingCenter> getAllTrainingCenters() {
        return trainingCenterRepository.findAll();
    }
}
