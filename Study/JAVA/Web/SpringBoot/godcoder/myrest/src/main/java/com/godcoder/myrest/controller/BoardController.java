package com.godcoder.myrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board/free")
    public String freeboard(){
        return "/board/freeboard";

    }

}
