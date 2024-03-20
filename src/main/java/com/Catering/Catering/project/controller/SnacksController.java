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

import com.Catering.Catering.project.entity.Snacks;
import com.Catering.Catering.project.service.SnacksService;

@RestController
@RequestMapping
("/snacks")
public class SnacksController {
    
    @Autowired
    private SnacksService snacksService;

    @GetMapping("/{id}")
    public ResponseEntity<Snacks> getSnacksById(@PathVariable("id") Long id) {
        Snacks snacks = snacksService.getSnacksById(id);
        return ResponseEntity.ok(snacks);
    }

    
    @GetMapping
    public ResponseEntity<List<Snacks>> getAllSnacks() {
        List<Snacks> snacks = snacksService.getAllSnacks();
        return ResponseEntity.ok(snacks);
    }
    
    @PostMapping
    public ResponseEntity<Snacks> createSnacks(@RequestBody Snacks snacks) {
        Snacks createdSnacks = snacksService.createSnacks(snacks);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSnacks);
    }
}