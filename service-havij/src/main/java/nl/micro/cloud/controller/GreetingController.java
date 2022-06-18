package nl.micro.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableFeignClients
@RestController
@RequestMapping("/havij")
public class GreetingController {

    @Autowired
    private BaghaliClient baghaliClient;

    @RequestMapping("/greeting")
    public String greeting() {
        return baghaliClient.greeting();
    }

}
