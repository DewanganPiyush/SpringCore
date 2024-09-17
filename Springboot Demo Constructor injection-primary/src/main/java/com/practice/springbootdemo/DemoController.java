package com.practice.springbootdemo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private coach myCoach;

// qualifers :- which bean to be selected by democontroller
    public DemoController(coach myCoach) {
        this.myCoach = myCoach ;
    }

    @GetMapping("/Workout")
    public String workout() {
        return myCoach.getDailyWorkout();
    }


}
