package WooJ.Gogo.controller;

import WooJ.Gogo.dto.TestDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestingController {

    @GetMapping("/1")
    public String testOne(){
        return "test";
    }

    @PostMapping("2")
    public String testTwo(TestDTO dto){
        System.out.println(dto.toString());
        return "";
    }

}
