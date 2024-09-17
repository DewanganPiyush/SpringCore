package com.practice.springbootdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootBallCoach implements coach{

    @Override
    public String getDailyWorkout() {
        return "practice football kick daily";
    }
}
