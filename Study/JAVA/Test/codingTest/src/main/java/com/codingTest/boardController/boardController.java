package com.codingTest.boardController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class boardController {

	@GetMapping("/")
	public String board() {
		return "board";
	}
}
