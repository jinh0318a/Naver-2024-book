package com.callor.naver.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.naver.model.UserVO;

public interface UserDao {

	public int insert(UserVO userVO);

	@Select("select * from tbl_users where username=#{username}")
	public UserVO findByID(String username);

	@Select("select * from tbl_users")
	public List<UserVO> selectAll();

}
