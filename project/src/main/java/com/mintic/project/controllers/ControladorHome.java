package com.mintic.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorHome {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/acerca")
    public String acerca(){
        return "acerca";
    }

}
