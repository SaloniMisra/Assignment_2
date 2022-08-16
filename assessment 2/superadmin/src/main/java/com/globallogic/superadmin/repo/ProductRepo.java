package com.globallogic.superadmin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.superadmin.model.Product;



public interface ProductRepo extends JpaRepository<Product, Integer> {

}
