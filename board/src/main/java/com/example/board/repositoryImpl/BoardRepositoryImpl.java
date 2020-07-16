package com.example.board.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.board.entity.Board;
import com.example.board.mapper.BoardMapper;
import com.example.board.repository.BoardRepository;

@Repository
public class BoardRepositoryImpl implements BoardRepository {
	
	
	@Autowired
	BoardMapper mapper;
	
	public int write(Board board) {
		return mapper.write(board);
		
	}

}
