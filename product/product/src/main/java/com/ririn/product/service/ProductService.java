package com.ririn.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ririn.product.repository.ProductRepository;
import com.ririn.product.model.Product;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product geProductById(Long Id){
        return productRepository.findById(Id).orElse(null);
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(Long Id){
        productRepository.deleteById(Id);
    }
}