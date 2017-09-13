package com.xxx.springSample;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String inputFriend() {
        
        return "hello";
    }
    
    public static void main(String[] arguments) {
        SpringApplication.run(SpringController.class, arguments);
    }

}
