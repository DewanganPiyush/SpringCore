package com.practice.springbootdemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements coach {

    @Override
    public String getDailyWorkout() {
        return "practice football kick daily";
    }
}
