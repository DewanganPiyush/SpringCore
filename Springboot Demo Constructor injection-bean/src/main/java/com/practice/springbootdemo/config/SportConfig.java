package com.practice.springbootdemo.config;

import com.practice.springbootdemo.common.SwimCoach;
import com.practice.springbootdemo.common.coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("abcds")
    public coach swimCoach() {
        return new SwimCoach();
    }
}
