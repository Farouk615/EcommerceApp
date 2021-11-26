package com.loveToCode.EcommerceApp.dao;

import com.loveToCode.EcommerceApp.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
