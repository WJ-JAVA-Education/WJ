package com.bit.springNote2.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.bit.springNote2.dao.NoteDAO;
import com.bit.springNote2.dto.NoteDTO;

public class NoteListCommand implements NoteCommand {

	@Override
	public void execute(Model model) {
		NoteDAO dao = new NoteDAO();
		ArrayList<NoteDTO> dto = dao.list();
		model.addAttribute("list", dto);
	}

	
	
	
	
	
}
