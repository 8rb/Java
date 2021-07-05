package com.fastinventory.stockservice.repository;

import com.fastinventory.stockservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
