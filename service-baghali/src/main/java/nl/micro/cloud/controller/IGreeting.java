package nl.micro.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IGreeting {
    @RequestMapping("/baghali-greeting")
    String greeting();
}