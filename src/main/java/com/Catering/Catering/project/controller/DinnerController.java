package com.Catering.Catering.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Catering.Catering.project.entity.Dinner;
import com.Catering.Catering.project.service.DinnerService;

@RestController
@RequestMapping("/dinner")
public class DinnerController {
    
    @Autowired
    private DinnerService dinnerService;

    @GetMapping("/{id}")
    public ResponseEntity<Dinner> getDinnerById(@PathVariable("id") Long id) {
        Dinner dinner = dinnerService.getDinnerById(id);
        return ResponseEntity.ok(dinner);
    }
    
    @GetMapping
    public ResponseEntity<List<Dinner>> getAllDinners() {
        List<Dinner> dinners = dinnerService.getAllDinners();
        return ResponseEntity.ok(dinners);
    }

    @PostMapping
    public ResponseEntity<Dinner> createDinner(@RequestBody Dinner dinner) {
        Dinner createdDinner = dinnerService.createDinner(dinner);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDinner);
    }
}