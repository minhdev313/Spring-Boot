package com.example.demo.Controller;

import com.example.demo.Product.Product;
import com.example.demo.respositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
    @Autowired
    private ProductRepository repository;
    @GetMapping("")
//    http://localhost:8080/api/v1/Products
    List<Product> getAllProducts() {
        return List.of(
                new Product(1L, "Iphone XS Max", 2023, 200000.0, ""),
                new Product(2L, "Iphone 7 Pro", 2023, 230000.0, ""));
    }
}
