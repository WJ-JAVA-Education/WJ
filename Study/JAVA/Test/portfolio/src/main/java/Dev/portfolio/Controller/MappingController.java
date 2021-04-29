package Dev.portfolio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MappingController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/HTML5")
	public String HTML5() {
		return "/skill/HTML5";
	}
	
	@GetMapping("/CSS3")
	public String CSS3() {
		return "/skill/CSS3";
	}
	
	@GetMapping("/BootStrap")
	public String BootStrap() {
		return "/skill/BootStrap";
	}
	@GetMapping("/Java")
	public String Java() {
		return "/skill/Java";
	}
	@GetMapping("/JavaScript")
	public String JavaScript() {
		return "/skill/JavaScript";
	}
	@GetMapping("/Spring")
	public String Spring() {
		return "/skill/Spring";
	}
	
	@GetMapping("/SpringBoot")
	public String SpringBoot() {
		return "/skill/SpringBoot";
	}
	
	@GetMapping("/DataBase")
	public String DataBase() {
		return "/skill/DataBase";
	}
	
	@GetMapping("/Thymeleaf")
	public String Thymeleaf() {
		return "/skill/Thymeleaf";
	}
	

}
