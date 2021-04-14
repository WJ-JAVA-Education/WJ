/**
 * 
 */
package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/* WooJ 2021. 4. 13. 오후 3:05:02  TODO -> 회원 관리를 위한 간단한 홈 컨트롤러   */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
	return "home";
    }
    
}
