package com.bit.springNote2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bit.springNote2.command.NoteCommand;
import com.bit.springNote2.command.NoteDeleteCommand;
import com.bit.springNote2.command.NoteListCommand;
import com.bit.springNote2.command.NoteWriterCommand;
@Controller
public class NoteController {

	
	
	NoteCommand command;
	
	@RequestMapping(value = "noteForm")
	public String noteForm() {return "noteForm";}
	
	@RequestMapping(value = "write")
	public String write(HttpServletRequest req, Model model) {
		model.addAttribute("request", req);
		command = new NoteWriterCommand();
		command.execute(model);
		return "redirect:list"; // 리스트 액션 호출
	}
	
	@RequestMapping(value = "list")
	public String list(Model model) {
		command = new NoteListCommand();
		command.execute(model);
		return "noteList"; // noteList.jsp 호출
	}
	
	@RequestMapping(value = "delete")
	public String delete(HttpServletRequest req, Model model) {
		model.addAttribute("request", req);
		command = new NoteDeleteCommand();
		command.execute(model);
		return "redirect:list"; // list 액션 호출
	}
	
	
	
	
	
	
	
	
	
}
