package com.Catering.Catering.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Catering.Catering.project.entity.Cart;
import com.Catering.Catering.project.repo.CartRepo;
import com.Catering.Catering.project.service.CartService;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepo cartRepository;

    @Override
    public Cart getCartById(Long id) {
        return cartRepository.findById(id).orElse(null);
    }

    @Override
    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }
}