package com.practice.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private coach myCoach;

    // in setter injection constructor not needed becoz this is not an constructor injection
//    public DemoController(coach myCoach) {
//        this.myCoach = myCoach ;
//    }
    @Autowired
    public void setMyCoach(@Qualifier("footballCoach") coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/Workout")
    public String workout() {
        return myCoach.getDailyWorkout();
    }


}
