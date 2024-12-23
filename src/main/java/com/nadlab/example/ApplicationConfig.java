package com.nadlab.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    @Bean
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("First Bean");
    }


    @Bean
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("Second Bean");
    }

    @Bean
    @Primary
    public MyFirstClass myThirdBean(){
        return new MyFirstClass("third Bean");
    }


}
