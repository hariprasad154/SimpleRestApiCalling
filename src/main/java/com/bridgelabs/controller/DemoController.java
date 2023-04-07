package com.bridgelabs.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @RequestMapping(value="/message",method= RequestMethod.GET)
    public String message(){
    return "Hello From Bridgelabs";
    }
    @RequestMapping(value = "/quaryparam",method = RequestMethod.GET)
    public String message1(@RequestParam String message){
        return message;
    }

}
