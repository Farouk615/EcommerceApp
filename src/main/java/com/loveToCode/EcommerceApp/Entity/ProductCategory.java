package com.loveToCode.EcommerceApp.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_category")
// with @Data -> there is a know bug when working with many to many and one to many
public class ProductCategory {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "category")
    private Set<Product> products;
}
