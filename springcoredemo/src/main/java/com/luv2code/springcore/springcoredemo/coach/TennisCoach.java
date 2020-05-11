package com.luv2code.springcore.springcoredemo.coach;

import com.luv2code.springcore.springcoredemo.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
    }

    @Override
    public String getDailyWork() {
        return "Play Tennis for 2 hours a day";
    }

    public String getFortuneService() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void doPostContruct() {
         System.out.println("Post Construct method");
    }

    @PreDestroy
    public void doPreDestroy() {
        System.out.println("Pre Destroy Method");
    }
}
