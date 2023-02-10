package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserSearchRequest implements Serializable {
	
	/** ユーザーID */
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
