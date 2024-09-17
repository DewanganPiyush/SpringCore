package com.practice.springbootdemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements coach {
    @Override
    public String getDailyWorkout() {
        return "practice daily tennis practice 1hr";
    }
}
