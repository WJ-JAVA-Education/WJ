package com.wooj.hongpak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
    String username = "재우";

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username",username);
        return "greetings"; // templates/greetings.mustache -> 브라우저로 전송해준다.
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("username", username);
        return "goodbye";
    }
}
