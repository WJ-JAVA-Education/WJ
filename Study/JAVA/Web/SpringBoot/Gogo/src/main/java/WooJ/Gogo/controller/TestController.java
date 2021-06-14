package WooJ.Gogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import WooJ.Gogo.dto.TestDTO;
import WooJ.Gogo.entity.TestDB;
import WooJ.Gogo.repository.TestRepository;

@Controller
@RequestMapping("/go")
public class TestController {
	
	@Autowired
	TestRepository tr;
	
	@GetMapping("/gogo")
	public String testOne() {
		return "gogo";
	}
	
	@PostMapping("/goAction")
	public String testTwo(TestDTO dto) {

		TestDB testdb = dto.tdbc();
		TestDB saved = tr.save(testdb);
		
		System.out.println(dto.toString());
		System.out.println(saved.toString());
		
		return "";
	}

}
