package com.sisman.omer.springsecurityjdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {

    @GetMapping("/")
    public String home(){
        return "<h1>Welcome Home Page!</h1>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h1>Welcome User Page!</h1>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h1>Welcome Admin Page!</h1>";
    }

}
