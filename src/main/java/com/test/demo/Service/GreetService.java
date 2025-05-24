package com.test.demo.Service;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetService {

    public String greetPerson (Optional<String> greetName) {
        if(greetName.isPresent()){
            return "Hello, " + greetName.get();
        } else {
            return "Hello World";
        }
    }

}
