package com.example.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.entity.Board;

@Mapper
public interface BoardMapper {
	public int write(Board board);
}
