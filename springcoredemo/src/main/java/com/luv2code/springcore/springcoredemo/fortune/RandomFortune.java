package com.luv2code.springcore.springcoredemo.fortune;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RandomFortune  implements FortuneService {

    @Override
    public String getFortune() {
        return "You will feel good today";
    }
}
