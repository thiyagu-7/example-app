package com.mydemo.app.exampleapp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingController {

    @RequestMapping("/hello/{name}")
    @CrossOrigin
    String hello(@PathVariable String name) {
        return "Hello there, " + name + "!";
    }

    @RequestMapping("/get")
    @CrossOrigin
    public String index() {
        return "Greetings from the Application..!";
    }
}
