package com.callor.naver.service;

import org.springframework.dao.DataAccessException;

import com.callor.naver.model.UserVO;

public interface UserService {
	public UserVO createUser(UserVO userVO) throws DataAccessException;
}
