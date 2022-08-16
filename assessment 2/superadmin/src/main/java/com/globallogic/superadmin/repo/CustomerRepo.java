package com.globallogic.superadmin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.superadmin.model.Customer;



public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
