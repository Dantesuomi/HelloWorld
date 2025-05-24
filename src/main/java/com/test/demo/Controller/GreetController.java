package com.test.demo.Controller;

import com.test.demo.Service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GreetController {

    private GreetService greetService;

    @Autowired
    public GreetController(GreetService greetService) {
        this.greetService = greetService;
    }

    @GetMapping("/greet")
    public String showGreeting(@RequestParam Optional<String> name) {
        return greetService.greetPerson(name);
    }

}
