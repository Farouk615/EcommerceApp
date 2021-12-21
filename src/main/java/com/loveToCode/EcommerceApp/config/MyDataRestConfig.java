package com.loveToCode.EcommerceApp.config;

import com.loveToCode.EcommerceApp.Entity.Product;
import com.loveToCode.EcommerceApp.Entity.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        // Disable Http methods for PUT POST DELETE (Read only Configuration) for Product
        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
        // Disable Http methods for PUT POST DELETE (Read only Configuration) for ProductCategory
        config.getExposureConfiguration().forDomainType(Product.class).withItemExposure(((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))).withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions)));
        config.getExposureConfiguration().forDomainType(ProductCategory.class).withItemExposure(((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))).withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions)));

    }
}
