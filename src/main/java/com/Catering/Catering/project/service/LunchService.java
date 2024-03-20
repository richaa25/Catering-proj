package com.Catering.Catering.project.service;

import java.util.List;

import com.Catering.Catering.project.entity.Lunch;

public interface LunchService {

	Lunch getLunchById(Long id);
    Lunch createLunch(Lunch lunch);
    List<Lunch> getAllLunches();
}
