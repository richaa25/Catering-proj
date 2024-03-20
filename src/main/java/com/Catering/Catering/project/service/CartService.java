package com.Catering.Catering.project.service;

import java.util.List;

import com.Catering.Catering.project.entity.Cart;

public interface CartService {

	Cart getCartById(Long id);
    Cart createCart(Cart cart);
    List<Cart> getAllCarts();
}
