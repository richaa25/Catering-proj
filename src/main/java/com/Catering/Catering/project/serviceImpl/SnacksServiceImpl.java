package com.Catering.Catering.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Catering.Catering.project.entity.Snacks;
import com.Catering.Catering.project.repo.SnacksRepo;
import com.Catering.Catering.project.service.SnacksService;

@Service
public class SnacksServiceImpl implements SnacksService {

    @Autowired
    private SnacksRepo snacksRepository;

    @Override
    public Snacks getSnacksById(Long id) {
        return snacksRepository.findById(id).orElse(null);
    }

    @Override
    public Snacks createSnacks(Snacks snacks) {
        return snacksRepository.save(snacks);
    }

    @Override
    public List<Snacks> getAllSnacks() {
        return snacksRepository.findAll();
    }
}