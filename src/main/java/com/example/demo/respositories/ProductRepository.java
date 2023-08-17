package com.example.demo.respositories;

import com.example.demo.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Jpa21Utils;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
