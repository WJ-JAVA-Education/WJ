package com.bit.springNote.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.bit.springNote.dto.NoteDTO;

public class NoteDAO {

	DataSource ds;

	public NoteDAO() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle18g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// writer -> 글을 작성하는 메소드
	public void write(String writer, String content) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = ds.getConnection();
			sql = "insert into tblNote(id, writer, content)values(tblNoteSeq.nextval,?,?)";
//				sql = "insert tblNote(writer,content) values(?,?)"; mysql 전용
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, content);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}

	// list -> 리스트를 가져오는 메서드
	public ArrayList<NoteDTO> list(){
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			ArrayList<NoteDTO> dto = new ArrayList<NoteDTO>();
		try {
			con = ds.getConnection();
			sql = "select * from tblNote order by id desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				int id = rs.getInt(1);
				String writer = rs.getString(2);
				String content = rs.getString(3);
				//첫번째 방식
//			NoteDTO dto = new NoteDTO(id, writer, content);
//			dtos.add(dto);
				//두번째방식 (코드가 짧아짐)
			dto.add(new NoteDTO(id, writer, content));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(pstmt!=null) pstmt.close();
			if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}return dto;
	}
	
	// delete
	public void delete(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		ArrayList<NoteDTO> dtos = new ArrayList<NoteDTO>();
	try {
		con = ds.getConnection();
		sql = "delete from tblNote where id = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
		if(pstmt!=null) pstmt.close();
		if(con!=null)con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}

	
	
	
	
	
	
	
}
	
