package com.luv2code.springcore.springcoredemo.component;

import com.luv2code.springcore.springcoredemo.coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coach")
public class CoachRestController {


    private Coach coach;

    public CoachRestController(Coach coach) {
        this.coach = coach;
    }

     @GetMapping("/getDailyWork")
    public String getDailyWork() {
        return coach.getDailyWork();

    }

    @GetMapping("/fortune")
    public  String getFortune() {
         return coach.getFortuneService();
    }
}
