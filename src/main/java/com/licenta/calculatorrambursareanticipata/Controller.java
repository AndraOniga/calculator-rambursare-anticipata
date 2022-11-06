package com.licenta.calculatorrambursareanticipata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/sayHelloTo/{to}")
    public String helloWorld(@PathVariable String to, @RequestParam(name ="altii") String altii){
        return "Hello " + to + "! aaaandd " + altii;
    }
}
