package nl.micro.cloud.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("${service.baghali.name}")
public interface BaghaliClient {
    @RequestMapping("/baghali-greeting")
    String greeting();
}