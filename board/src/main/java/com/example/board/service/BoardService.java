package com.example.board.service;

import javax.servlet.http.HttpSession;

import com.example.board.dto.BoardDTO;

public interface BoardService {
	
	public boolean write(BoardDTO board, HttpSession session); 

}
