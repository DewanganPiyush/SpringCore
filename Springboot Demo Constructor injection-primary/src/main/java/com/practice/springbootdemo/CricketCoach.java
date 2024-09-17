package com.practice.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements coach{

    @Override
    public String getDailyWorkout() {
        return "Practice long jump and bowling fast ";
    }
}
