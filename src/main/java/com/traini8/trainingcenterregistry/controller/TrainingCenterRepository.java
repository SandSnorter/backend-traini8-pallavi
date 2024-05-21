package com.traini8.trainingcenterregistry.controller;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.traini8.trainingcenterregistry.model.TrainingCenter;

public interface TrainingCenterRepository extends MongoRepository<TrainingCenter, String> {
}
