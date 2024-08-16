package com.babbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.babbo.dto.BabboUserDTO;
import com.babbo.service.BabboService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MainController {
	
	@Autowired
	private final BabboService babboSerivce;

	public MainController(BabboService babboSerivce) {
		this.babboSerivce = babboSerivce;
	}

	@PostMapping("/user/register")
	public String userRegister(@RequestBody BabboUserDTO user) {
		System.out.println(user);
		babboSerivce.userRegister(user);
		return "회원가입 완료";
	}
	
	
}
