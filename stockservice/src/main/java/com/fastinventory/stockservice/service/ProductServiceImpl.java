package com.fastinventory.stockservice.service;

import com.fastinventory.stockservice.exception.ResourceNotFoundException;
import com.fastinventory.stockservice.model.Product;
import com.fastinventory.stockservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ProductServiceImpl")
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId).orElseThrow(() -> new ResourceNotFoundException("Product", "Id", productId));
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long productId, Product productRequest) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product", "Id", productId));
        product.setName(productRequest.getName());
        product.setCode(productRequest.getCode());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());
        return productRepository.save(product);
    }

    @Override
    public ResponseEntity<?> deleteProduct(Long productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product", "Id", productId));
        productRepository.delete(product);
        return ResponseEntity.ok().build();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
