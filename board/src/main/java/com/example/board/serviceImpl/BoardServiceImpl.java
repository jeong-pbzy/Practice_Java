package com.example.board.serviceImpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.dto.BoardDTO;
import com.example.board.entity.Board;
import com.example.board.repository.BoardRepository;
import com.example.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardRepository repository;
	
	public boolean write(BoardDTO board, HttpSession session) {
		Board entity = new Board();
		entity.setTitle(board.getTitle());
		entity.setContents(board.getContents());
		entity.setUser((String)session.getAttribute("user_id"));
		
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
		
		
		entity.setInsert_date(dtf.format(now));
		int writeResult = repository.write(entity);
		
		if(writeResult >0) {
			return true;
		}
		return false;
	}


}
