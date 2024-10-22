package com.callor.naver.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.callor.naver.model.UserVO;

@Repository
public interface UserDao {

	public int insert(UserVO userVO);

	@Select("select * from tbl_users where id=#{id}")
	public UserVO findByID(String id);

	@Select("select * from tbl_users")
	public List<UserVO> selectAll();

}
