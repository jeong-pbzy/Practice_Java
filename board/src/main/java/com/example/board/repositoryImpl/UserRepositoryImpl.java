package com.example.board.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.board.dto.User;
import com.example.board.mapper.UserMapper;
import com.example.board.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	UserMapper mapper;
	
	public User login(User user) {
		
		User userResult =mapper.login(user);
		
		return userResult;
			
	}
	
	public int singIn(User user)
	{
		
		return mapper.singIn(user);
	}
}
