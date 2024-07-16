/*
To call the CorsConfig class, you don't need to explicitly call it.
The Spring framework automatically detects and applies the CORS settings
defined in the CorsConfig class.
 */
package com.igortech.schoolservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Service
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/school").allowedOrigins("http://localhost:9000");
    }
}