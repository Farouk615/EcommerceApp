package com.loveToCode.EcommerceApp.dao;

import com.loveToCode.EcommerceApp.Entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200") // Accept calls for api from this origin
// Origin = hostName , protocol  , portNumber
public interface ProductRepository extends JpaRepository<Product,Long> {
    // Query method findByCategory
    // Url shoul be => localhost:8070/api/products/search/findByCategoryId?id=1
    Page<Product> findByCategoryId(@RequestParam("id")Long id, Pageable pageable);
}
