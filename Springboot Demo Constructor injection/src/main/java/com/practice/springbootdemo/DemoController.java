package com.practice.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private coach myCoach;

    public DemoController(coach myCoach) {
        this.myCoach = myCoach ;
    }

    @GetMapping("/Workout")
    public String workout() {
        return myCoach.getDailyWorkout();
    }


}
