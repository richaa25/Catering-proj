package com.Catering.Catering.project.service;

import java.util.List;

import com.Catering.Catering.project.entity.Dinner;

public interface DinnerService {
    Dinner getDinnerById(Long id);
    Dinner createDinner(Dinner dinner);
    List<Dinner> getAllDinners();
}