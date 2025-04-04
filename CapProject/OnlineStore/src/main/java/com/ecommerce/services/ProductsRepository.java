package com.ecommerce.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
