package com.Catering.Catering.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Catering.Catering.project.entity.Breakfast;
import com.Catering.Catering.project.repo.BreakfastRepo;
import com.Catering.Catering.project.service.BreakfastService;

@Service
public class BreakfastServiceImpl implements BreakfastService {

    @Autowired
    private BreakfastRepo breakfastRepository;

    @Override
    public Breakfast getBreakfastById(Long id) {
        return breakfastRepository.findById(id).orElse(null);
    }

    @Override
    public Breakfast createBreakfast(Breakfast breakfast) {
        return breakfastRepository.save(breakfast);
    }

    @Override
    public List<Breakfast> getAllBreakfasts() {
        return breakfastRepository.findAll();
    }
}