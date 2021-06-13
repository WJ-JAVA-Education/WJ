package com.WooJ.SpringBoot.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "greetings";
    }

    @PostMapping("test1")
    public String test1(String title, String content){
        System.out.println(title);
        System.out.println(content);
        return "";
    }

    @PostMapping("/member")
    public String member(String name , int age){
        return "testPage";
    }

    @RequestMapping("/member/{name}/{age}")
    public String member(@PathVariable("name") String name, @PathVariable("age") String age){
        return  "testPage";
    }



    @GetMapping("register")
    public String regiser(){
        return "register";
    }

    @PostMapping("register.do")
    public String registerAction(){
        return "";
    }

}
