package com.loveToCode.EcommerceApp.dao;

import com.loveToCode.EcommerceApp.Entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory",path = "product_category") // Customisation , name of Json entry is collectionResourceRel wel path howa url
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {
}
