package com.bridgelabs.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @RequestMapping(value="/message",method= RequestMethod.GET)
    public String message(){
    return "Hello basic message";
    }

}
