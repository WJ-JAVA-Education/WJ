package com.codingTest.boardController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class boardController {

	@GetMapping("/")
	public String board() {
		return "board";
	}
	
	@GetMapping("test1")
		public String test1(Model model) {
		Object gogo = "占싣놂옙占싹쇽옙占쏙옙";
		model.addAttribute("gogo",gogo);
		return "test1";
	}
	
}
