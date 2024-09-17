package com.practice.springbootdemo.common;

public class SwimCoach implements coach{

    @Override
    public String getDailyWorkout() {
        return "Swim 100m daily";
    }
}
