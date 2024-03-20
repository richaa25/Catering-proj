package com.Catering.Catering.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Snacks {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long s_id;
    private String s_name;
    private String s_photo;
    private String s_desc;
    
//    @ManyToOne
//    @JoinColumn(name = "cart_id")
//    private Cart cart;
    
    public Snacks() {
		super();
		
	}

	public Snacks(Long s_id, String s_name, String s_photo, String s_desc, Cart cart) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_photo = s_photo;
		this.s_desc = s_desc;
		//this.cart = cart;
	}

	public Long getS_id() {
		return s_id;
	}

	public void setS_id(Long s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_photo() {
		return s_photo;
	}

	public void setS_photo(String s_photo) {
		this.s_photo = s_photo;
	}

	public String getS_desc() {
		return s_desc;
	}

	public void setS_desc(String s_desc) {
		this.s_desc = s_desc;
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
		return "Snacks [s_id=" + s_id + ", s_name=" + s_name + ", s_photo=" + s_photo + ", s_desc=" + s_desc + "]";
	}
	
    
    
    
}
