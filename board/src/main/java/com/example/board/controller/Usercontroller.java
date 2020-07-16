package com.example.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.board.dto.User;
import com.example.board.service.UserService;

@Controller
@RequestMapping("/user")
public class Usercontroller {
	
	public static final String ERROR_MSG = "아이디 혹은 비밀번호를 다시 한번 확인해주세요.";
	public static final String SUCCESS_MSG = "회원가입이 완료되었습니다.";
	
	@Autowired
	UserService service;
	
	@GetMapping("/login")
	public ModelAndView loginPage(ModelAndView mv) {
		System.out.println("enter");
		mv.setViewName("login");
		
		return mv;

	}
	@PostMapping("/login")
	public ModelAndView doLogin(ModelAndView mv, User user, HttpSession session) {
		
		service.login(user);
		
		//System.out.println(user.getId());
		//System.out.println(user.getPassword());
		boolean loginResult = service.login(user);
		
		if(loginResult) {
			
			session.setAttribute("user_id", user.getUser_id());
			mv.setViewName("index");
		} else {
			
			mv.setViewName("login");
			mv.addObject("errorMsg", ERROR_MSG);
		}
		
		
		
		return mv;
	}
	@GetMapping("/signIn")
	public ModelAndView signInPage (ModelAndView mv) {
		mv.setViewName("signIn");
		return mv;
	}
	
	@PostMapping("/singIn")
	public ModelAndView dosignin(ModelAndView mv, User user) {
	
		boolean signInResult = service.singIn(user);
		
		if(signInResult) {
			mv.setViewName("login");
			mv.addObject("successMsg", SUCCESS_MSG);
			
		}else {
			mv.setViewName("singIn");
		}
		
		
		System.out.println(user.getUser_id());
		System.out.println(user.getUser_password());
		System.out.println(user.getEmail());
		System.out.println(user.getBirthday());
		System.out.println(user.getSex());
		return mv;
		
		}
}
