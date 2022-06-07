/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.ecommerce.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 * 
 * @author albertv
 * 
 * 
 *         Jun 7, 2022
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#addCorsMappings(org.
     * springframework.web.servlet.config.annotation.CorsRegistry)
     */
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**")
        .allowedOrigins("http://localhost:4200")
        .allowedMethods("*")
        .maxAge(3600L)
        .allowedHeaders("*")
        .exposedHeaders("Authorization")
        .allowCredentials(true);
    }
}
