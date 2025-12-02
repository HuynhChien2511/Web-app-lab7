package com.example.demo.service;

import com.example.demo.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    
    List<Product> getAllProducts();
    
    // EXERCISE 7: Support sorting
    List<Product> getAllProducts(Sort sort);
    
    Optional<Product> getProductById(Long id);
    
    Product saveProduct(Product product);
    
    void deleteProduct(Long id);
    
    List<Product> searchProducts(String keyword);
    
    // EXERCISE 5.3: Pagination support
    Page<Product> searchProducts(String keyword, Pageable pageable);
    
    List<Product> getProductsByCategory(String category);
    
    // EXERCISE 5.1: Multi-criteria search
    List<Product> advancedSearch(String name, String category, BigDecimal minPrice, BigDecimal maxPrice);
    
    // EXERCISE 5.2: Get all categories
    List<String> getAllCategories();
    
    // EXERCISE 8.1: Statistics methods
    long countByCategory(String category);
    BigDecimal calculateTotalValue();
    BigDecimal calculateAveragePrice();
    List<Product> findLowStockProducts(int threshold);
    List<Product> getRecentProducts();
}
