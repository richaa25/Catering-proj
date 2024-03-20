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

import com.Catering.Catering.project.entity.Lunch;
import com.Catering.Catering.project.service.LunchService;

@RestController
@RequestMapping("/lunch")
public class LunchController {
    
    @Autowired
    private LunchService lunchService;

    @GetMapping("/{id}")
    public ResponseEntity<Lunch> getLunchById(@PathVariable("id") Long id) {
        Lunch lunch = lunchService.getLunchById(id);
        return ResponseEntity.ok(lunch);
    }
    @GetMapping
    public ResponseEntity<List<Lunch>> getAllLunches() {
        List<Lunch> lunchs = lunchService.getAllLunches();
        return ResponseEntity.ok(lunchs);
    }

    @PostMapping
    public ResponseEntity<Lunch> createLunch(@RequestBody Lunch lunch) {
        Lunch createdLunch = lunchService.createLunch(lunch);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdLunch);
    }
}