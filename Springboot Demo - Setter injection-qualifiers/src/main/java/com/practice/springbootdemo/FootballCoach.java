package com.practice.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements coach{
    @Override
    public String getDailyWorkout() {
        return "football practice daily 1hr";
    }
}
