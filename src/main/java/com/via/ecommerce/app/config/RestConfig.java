/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.ecommerce.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import com.via.ecommerce.app.entity.Product;
import com.via.ecommerce.app.entity.ProductCategory;

/**
 * 
 * @author albertv
 * 
 */
@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    /**
     * (non-Javadoc)
     * 
     * @see org.springframework.data.rest.webmvc.config.RepositoryRestCon figurer#
     *      configureRepositoryRestConfiguration(org.springframework.data.rest.core.config.
     *      RepositoryRestConfiguration)
     */
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
        
        //disable HTTP methods for Product: PUT, POST, DELETE
        config.getExposureConfiguration()
            .forDomainType(Product.class)
            .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
            .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
        
        //disable HTTP methods for ProductCategory: PUT, POST, DELETE
        config.getExposureConfiguration()
            .forDomainType(ProductCategory.class)
            .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
            .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
    }
}
