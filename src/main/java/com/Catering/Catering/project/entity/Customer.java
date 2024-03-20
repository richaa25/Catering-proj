package com.Catering.Catering.project.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cust_id;
    private String cust_name;
    private String cust_phone;
    private String venue;
    private String occasion;
    private Date func_date;
    private int numberofperson;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
    private Cart cart;
    
    public Customer() {
		super();
	}
    
	public Customer(Long cust_id, String cust_name, String cust_phone, String venue, String occasion, Date func_date,
			int numberofperson) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_phone = cust_phone;
		this.venue = venue;
		this.occasion = occasion;
		this.func_date = func_date;
		this.numberofperson = numberofperson;
	}

	public Long getCust_id() {
		return cust_id;
	}

	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_phone() {
		return cust_phone;
	}

	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getOccasion() {
		return occasion;
	}

	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}

	public Date getFunc_date() {
		return func_date;
	}

	public void setFunc_date(Date func_date) {
		this.func_date = func_date;
	}

	public int getNumberofperson() {
		return numberofperson;
	}

	public void setNumberofperson(int numberofperson) {
		this.numberofperson = numberofperson;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_phone=" + cust_phone + ", venue="
				+ venue + ", occasion=" + occasion + ", func_date=" + func_date + ", numberofperson=" + numberofperson
				+ "]";
	}
    
    
    
    
}
