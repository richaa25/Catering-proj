package com.Catering.Catering.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Breakfast {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long b_id;
    private String b_name;
    private String b_photo;
    private String b_desc;
    
//    @ManyToOne
//    @JoinColumn(name = "cart_id")
//    private Cart cart;
    
    public Breakfast() {
		super(); 
	}

	public Breakfast(Long b_id, String b_name, String b_photo, String b_desc, Cart cart) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.b_photo = b_photo;
		this.b_desc = b_desc;
		//this.cart = cart;
	}

	public Long getB_id() {
		return b_id;
	}

	public void setB_id(Long b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_photo() {
		return b_photo;
	}

	public void setB_photo(String b_photo) {
		this.b_photo = b_photo;
	}

	public String getB_desc() {
		return b_desc;
	}

	public void setB_desc(String b_desc) {
		this.b_desc = b_desc;
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
		return "Breakfast [b_id=" + b_id + ", b_name=" + b_name + ", b_photo=" + b_photo + ", b_desc=" + b_desc
				+ "]";
	}
    
	
	
    
}
