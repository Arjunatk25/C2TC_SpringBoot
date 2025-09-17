package com.tnsif.customerservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.customerservice.entity.Customer;

public interface  CustomerRepository extends JpaRepository<Customer, Integer> {

	

}
