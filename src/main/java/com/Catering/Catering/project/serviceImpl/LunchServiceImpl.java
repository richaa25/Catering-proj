package com.Catering.Catering.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Catering.Catering.project.entity.Lunch;
import com.Catering.Catering.project.repo.LunchRepo;
import com.Catering.Catering.project.service.LunchService;

@Service
public class LunchServiceImpl implements LunchService {

    @Autowired
    private LunchRepo lunchRepository;

    @Override
    public Lunch getLunchById(Long id) {
        return lunchRepository.findById(id).orElse(null);
    }

    @Override
    public Lunch createLunch(Lunch lunch) {
        return lunchRepository.save(lunch);
    }

    @Override
    public List<Lunch> getAllLunches() {
        return lunchRepository.findAll();
    }
}