package com.bit.springNote.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


//@NoArgsConstructor
@AllArgsConstructor
@Getter 
@Setter
public class NoteDTO {
	private int id;
	private String writer;
	private String content;
}
