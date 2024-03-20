package com.Catering.Catering.project.service;

import java.util.List;

import com.Catering.Catering.project.entity.Snacks;

public interface SnacksService {
    Snacks getSnacksById(Long id);
    Snacks createSnacks(Snacks snacks);
    List<Snacks> getAllSnacks();
}
