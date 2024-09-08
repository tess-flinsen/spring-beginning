package ua.kpi.ist.HelloWorldWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/about")
    public String about() {
        return "about.html";
    }
}
