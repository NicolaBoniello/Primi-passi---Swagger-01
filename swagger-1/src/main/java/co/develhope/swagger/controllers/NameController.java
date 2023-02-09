package co.develhope.swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name_controller")
public class NameController {
    private String myName;
    @GetMapping("/get_name")
    public String getName(){
        this.myName = "Nicola";
        return myName;
    }
}