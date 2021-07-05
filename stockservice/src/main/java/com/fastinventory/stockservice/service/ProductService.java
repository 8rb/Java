package com.fastinventory.stockservice.service;

import com.fastinventory.stockservice.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    Product getProductById(Long productId);
    Product createProduct(Product product);
    Product updateProduct(Long productId, Product productRequest);
    ResponseEntity<?> deleteProduct(Long productId);
    List<Product> getAllProducts();
}
