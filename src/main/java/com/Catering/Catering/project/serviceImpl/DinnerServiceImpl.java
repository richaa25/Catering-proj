package com.Catering.Catering.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Catering.Catering.project.entity.Dinner;
import com.Catering.Catering.project.repo.DinnerRepo;
import com.Catering.Catering.project.service.DinnerService;

@Service
public class DinnerServiceImpl implements DinnerService {

    @Autowired
    private DinnerRepo dinnerRepository;

    @Override
    public Dinner getDinnerById(Long id) {
        return dinnerRepository.findById(id).orElse(null);
    }

    @Override
    public Dinner createDinner(Dinner dinner) {
        return dinnerRepository.save(dinner);
    }

    @Override
    public List<Dinner> getAllDinners() {
        return dinnerRepository.findAll();
    }
}