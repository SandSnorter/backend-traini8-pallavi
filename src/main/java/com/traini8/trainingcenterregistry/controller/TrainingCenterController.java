package com.traini8.trainingcenterregistry.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.traini8.trainingcenterregistry.model.TrainingCenter;

@RestController
public class TrainingCenterController {

    @Autowired
    private TrainingCenterRepository trainingCenterRepository;

    @PostMapping("/trainingcenters")
    public TrainingCenter createTrainingCenter(@RequestBody TrainingCenter trainingCenter) {
        // Perform validation of the fields and handle exceptions
        // Populate the 'createdOn' field with the server timestamp
        // Save the training center entity in the database
        trainingCenter.setCreatedOn();

        // Save the training center entity in the database
        return trainingCenterRepository.save(trainingCenter);
    }
}
