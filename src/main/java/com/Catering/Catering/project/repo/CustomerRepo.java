package com.Catering.Catering.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Catering.Catering.project.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
