package com.babbo.service;

import org.springframework.stereotype.Service;

import com.babbo.dto.BabboUserDTO;
import com.babbo.mapper.BabboMapper;

@Service
public class BabboService {
	
	private BabboMapper mapper;

	public BabboService(BabboMapper mapper) {
		this.mapper = mapper;
	}

	public void userRegister(BabboUserDTO user) {
		mapper.userRegister(user);
	}
	
	
	
}
