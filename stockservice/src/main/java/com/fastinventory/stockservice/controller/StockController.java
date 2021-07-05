package com.fastinventory.stockservice.controller;

import com.fastinventory.stockservice.model.Product;
import com.fastinventory.stockservice.model.Store;
import com.fastinventory.stockservice.service.ProductService;
import com.fastinventory.stockservice.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController("Stock")
@CrossOrigin
@RequestMapping("/api")
public class StockController {

    @Autowired
    private ProductService productService;

    @Autowired
    private StoreService storeService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable(name = "id") Long flightId){
        return productService.getProductById(flightId);
    }

    @PostMapping("/products")
    public Product createProduct(@Valid @RequestBody Product resource)  {
        return productService.createProduct(resource);
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable(name = "id") Long flightId, @Valid @RequestBody Product resource) {
        return productService.updateProduct(flightId, resource);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable(name = "id") Long flightId) {
        return productService.deleteProduct(flightId);
    }

    @GetMapping("/stores")
    public List<Store> getAllStores(){
        return storeService.getAllStores();
    }
}
