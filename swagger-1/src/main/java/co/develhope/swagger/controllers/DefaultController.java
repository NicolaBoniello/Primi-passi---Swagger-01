package co.develhope.swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default_controller")
public class DefaultController {

    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome";
    }
}