package com.Catering.Catering.project.service;

import java.util.List;

import com.Catering.Catering.project.entity.Breakfast;

public interface BreakfastService {

	Breakfast getBreakfastById(Long id);
    List<Breakfast> getAllBreakfasts();
    Breakfast createBreakfast(Breakfast breakfast);
}
