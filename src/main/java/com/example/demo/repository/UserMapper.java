package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;

/**
 * ユーザー情報 mapper
 * 
 * @author yamaokahayato
 *
 */
@Mapper
public interface UserMapper {
	
	User search(UserSearchRequest user);

}
