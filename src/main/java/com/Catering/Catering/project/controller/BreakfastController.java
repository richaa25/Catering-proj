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

import com.Catering.Catering.project.entity.Breakfast;
import com.Catering.Catering.project.service.BreakfastService;

@RestController
@RequestMapping("/breakfast")
public class BreakfastController {

	    @Autowired
	    private BreakfastService breakfastService;

	    @GetMapping("/{id}")
	    public ResponseEntity<Breakfast> getBreakfastById(@PathVariable("id") Long id) {
	        Breakfast breakfast = breakfastService.getBreakfastById(id);
	        return ResponseEntity.ok(breakfast);
	    }
	    
	    @GetMapping
	    public ResponseEntity<List<Breakfast>> getAllBreakfasts() {
	        List<Breakfast> breakfasts = breakfastService.getAllBreakfasts();
	        return ResponseEntity.ok(breakfasts);
	    }

	    @PostMapping
	    public ResponseEntity<Breakfast> createBreakfast(@RequestBody Breakfast breakfast) {
	        Breakfast createdBreakfast = breakfastService.createBreakfast(breakfast);
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdBreakfast);
	    }
}
