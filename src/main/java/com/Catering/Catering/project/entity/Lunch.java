package com.Catering.Catering.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Lunch {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long l_id;
    private String l_name;
    private String l_photo;
    private String l_desc;
    
//    @ManyToOne
//    @JoinColumn(name = "cart_id")
//    private Cart cart;
    
    public Lunch() {
		super();
	}

	public Lunch(Long l_id, String l_name, String l_photo, String l_desc, Cart cart) {
		super();
		this.l_id = l_id;
		this.l_name = l_name;
		this.l_photo = l_photo;
		this.l_desc = l_desc;
		//this.cart = cart;
	}

	public Long getL_id() {
		return l_id;
	}

	public void setL_id(Long l_id) {
		this.l_id = l_id;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getL_photo() {
		return l_photo;
	}

	public void setL_photo(String l_photo) {
		this.l_photo = l_photo;
	}

	public String getL_desc() {
		return l_desc;
	}

	public void setL_desc(String l_desc) {
		this.l_desc = l_desc;
	}

//	public Cart getCart() {
//		return cart;
//	}
//
//	public void setCart(Cart cart) {
//		this.cart = cart;
//	}

	@Override
	public String toString() {
		return "Lunch [l_id=" + l_id + ", l_name=" + l_name + ", l_photo=" + l_photo + ", l_desc=" + l_desc + "]";
	}
    
	
}
