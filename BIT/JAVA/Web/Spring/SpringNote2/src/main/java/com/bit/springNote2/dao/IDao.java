package com.bit.springNote2.dao;

import java.util.ArrayList;

import com.bit.springNote2.dto.NoteDTO;

public interface IDao {
	
	public void writeDao(String writer, String content);
	public ArrayList<NoteDTO> listDao();
	public void deleteDao(String id);
	
	

}
