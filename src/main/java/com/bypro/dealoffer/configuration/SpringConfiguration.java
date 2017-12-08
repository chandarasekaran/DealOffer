package com.bypro.dealoffer.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @author chandru
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.bypro.dealoffer")
public class SpringConfiguration {

}
