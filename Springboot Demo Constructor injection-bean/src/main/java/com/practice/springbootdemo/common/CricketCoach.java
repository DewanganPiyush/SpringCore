package com.practice.springbootdemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements coach {

    @Override
    public String getDailyWorkout() {
        return "Practice long jump and bowling fast ";
    }
}
