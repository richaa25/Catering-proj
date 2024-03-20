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

import com.Catering.Catering.project.entity.Cart;
import com.Catering.Catering.project.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
    
    @Autowired
    private CartService cartService;

    @GetMapping("/{id}")
    public ResponseEntity<Cart> getCartById(@PathVariable("id") Long id) {
        Cart cart = cartService.getCartById(id);
        return ResponseEntity.ok(cart);
    }
    
    @GetMapping
    public ResponseEntity<List<Cart>> getAllCarts() {
        List<Cart> carts = cartService.getAllCarts();
        return ResponseEntity.ok(carts);
    }

    @PostMapping
    public ResponseEntity<Cart> createCart(@RequestBody Cart cart) {
        Cart createdCart = cartService.createCart(cart);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCart);
    }
}
