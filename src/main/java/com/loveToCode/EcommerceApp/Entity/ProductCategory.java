package com.loveToCode.EcommerceApp.Entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "product_category")
// with @Data -> there is a know bug when working with many to many and one to many
public class ProductCategory {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "category")
    private Set<Product> products;


}
