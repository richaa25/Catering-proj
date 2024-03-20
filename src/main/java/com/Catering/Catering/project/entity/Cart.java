package com.Catering.Catering.project.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long cart_id;

	    @OneToMany(cascade = CascadeType.ALL)
	    private List<Breakfast> breakfasts;

	    @OneToMany(cascade = CascadeType.ALL)
	    private List<Lunch> lunches;

	    @OneToMany(cascade = CascadeType.ALL)
	    private List<Dinner> dinners;

	    @OneToMany(cascade = CascadeType.ALL)
	    private List<Snacks> snacks;

	    @OneToOne(mappedBy = "cart", cascade = CascadeType.ALL)
	    private Customer customer;

		public Cart(Long cart_id, List<Breakfast> breakfasts, List<Lunch> lunches, List<Dinner> dinners,
				List<Snacks> snacks, Customer customer) {
			super();
			this.cart_id = cart_id;
			this.breakfasts = breakfasts;
			this.lunches = lunches;
			this.dinners = dinners;
			this.snacks = snacks;
			this.customer = customer;
		}

		public Cart() {
			super();
		}

		public Long getCart_id() {
			return cart_id;
		}

		public void setCart_id(Long cart_id) {
			this.cart_id = cart_id;
		}

		public List<Breakfast> getBreakfasts() {
			return breakfasts;
		}

		public void setBreakfasts(List<Breakfast> breakfasts) {
			this.breakfasts = breakfasts;
		}

		public List<Lunch> getLunches() {
			return lunches;
		}

		public void setLunches(List<Lunch> lunches) {
			this.lunches = lunches;
		}

		public List<Dinner> getDinners() {
			return dinners;
		}

		public void setDinners(List<Dinner> dinners) {
			this.dinners = dinners;
		}

		public List<Snacks> getSnacks() {
			return snacks;
		}

		public void setSnacks(List<Snacks> snacks) {
			this.snacks = snacks;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		@Override
		public String toString() {
			return "Cart [cart_id=" + cart_id + ", breakfasts=" + breakfasts + ", lunches=" + lunches + ", dinners="
					+ dinners + ", snacks=" + snacks + ", customer=" + customer + "]";
		}
		
		
		
	    
}
