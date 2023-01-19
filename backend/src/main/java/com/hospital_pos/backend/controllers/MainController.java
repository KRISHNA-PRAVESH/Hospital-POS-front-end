package com.hospital_pos.backend.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String home(){
        return "test-file";
    }
    
    @GetMapping("/test")
    public String test(){
        System.out.println("test controller");
        return "test-file";
    }

    @GetMapping("/login")
    public String login(){
      return "login-page/login";
    }

    @GetMapping("/home")
    @ResponseBody
    public String home(){
        return "Heyyyyy";
    }
}
