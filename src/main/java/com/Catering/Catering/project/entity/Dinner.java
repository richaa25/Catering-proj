package com.Catering.Catering.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Dinner {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long d_id;
    private String d_name;
    private String d_photo;
    private String d_desc;
    
//    @ManyToOne
//    @JoinColumn(name = "cart_id")
//    private Cart cart;
//    
    public Dinner() {
		super();
	}

	public Dinner(Long d_id, String d_name, String d_photo, String d_desc, Cart cart) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.d_photo = d_photo;
		this.d_desc = d_desc;
		//this.cart = cart;
	}

	public Long getD_id() {
		return d_id;
	}

	public void setD_id(Long d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_photo() {
		return d_photo;
	}

	public void setD_photo(String d_photo) {
		this.d_photo = d_photo;
	}

	public String getD_desc() {
		return d_desc;
	}

	public void setD_desc(String d_desc) {
		this.d_desc = d_desc;
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
		return "Dinner [d_id=" + d_id + ", d_name=" + d_name + ", d_photo=" + d_photo + ", d_desc=" + d_desc + "]";
	}
    
	
    
    
}
