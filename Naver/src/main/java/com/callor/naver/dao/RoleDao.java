package com.callor.naver.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.naver.model.RoleVO;

public interface RoleDao {

	public int insert(List<RoleVO> roles);

	@Select("select * from tbl_roles where r_username = #{username}")
	public List<RoleVO> findeByUsername(String username);

}
