package com.luv2code.springcore.springcoredemo.fortune;

import com.luv2code.springcore.springcoredemo.coach.Coach;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
