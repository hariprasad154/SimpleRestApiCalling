package com.bridgelabs.controller;

import com.bridgelabs.model.demoModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @RequestMapping(value="/message",method= RequestMethod.GET)
    public String message(){
    return "Hello From Bridgelabs";
    }
    @RequestMapping(value = "/quaryparam",method = RequestMethod.GET)
    public String message1(@RequestParam(value = "message",defaultValue = "Plz give the quary params as key valuves") String message){
        return message;
    }
    @RequestMapping(value = "/multipleqp",method = RequestMethod.GET)
    public String message2(@RequestParam String name ,@RequestParam String message){
        return name + message;
    }
    @RequestMapping(value = "/pathvariable/{message}",method = RequestMethod.GET)
    public String message3(@PathVariable String message){
        return message;
    }

    @RequestMapping(value = "/ReqBody",method = RequestMethod.POST)
    public String acceprData(@RequestBody demoModel user){
        return " Name :- "+ user.getFirstName()+" "+user.getLastName()+" \nMobileNumber:-"+user.getPhoneNumber();
    }
}
