package org.example.springiocexample.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.springiocexample.bean")
public class Config {

    @Bean
    public ConvertService createConvertServise() {
        return ConvertServiceImpl.getConvertService();
    }
}
