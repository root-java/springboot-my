package demo.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class StudentController {

    @RequestMapping("/word")
    public String test(){
        return "hello";
    }
}
