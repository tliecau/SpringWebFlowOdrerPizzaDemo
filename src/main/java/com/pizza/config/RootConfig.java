package com.pizza.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.context.annotation.FilterType.ANNOTATION;

@Configuration
@ComponentScan (basePackages = "com.pizza",
        excludeFilters={
                @Filter(type = ANNOTATION, value = EnableWebMvc.class)
        })
public class RootConfig {
}
