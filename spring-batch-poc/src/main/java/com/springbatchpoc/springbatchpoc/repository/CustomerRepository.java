package com.springbatchpoc.springbatchpoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbatchpoc.springbatchpoc.entity.Customer;

public interface CustomerRepository  extends  JpaRepository<Customer,Integer> {
}
