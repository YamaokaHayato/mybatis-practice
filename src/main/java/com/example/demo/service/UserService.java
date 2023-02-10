package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserMapper userMaper;
	
	public User search(UserSearchRequest userSearchRequest) {
		return userMaper.search(userSearchRequest);
	}

}
