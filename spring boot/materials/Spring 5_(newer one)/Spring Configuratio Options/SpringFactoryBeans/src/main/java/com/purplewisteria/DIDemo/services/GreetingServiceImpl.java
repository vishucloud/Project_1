package com.purplewisteria.DIDemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String WELCOME_MESSAGE = "Spring Framework DI Demo!! - Original";

    @Override
    public String sayGreeting() {
        return WELCOME_MESSAGE;
    }
}