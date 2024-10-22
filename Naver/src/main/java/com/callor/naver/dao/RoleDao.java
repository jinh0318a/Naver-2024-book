package com.callor.naver.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.callor.naver.model.RoleVO;

@Repository
public interface RoleDao {

	public int insert(List<RoleVO> roles);

	@Select("select * from tbl_roles where r_id = #{id}")
	public List<RoleVO> findeByUsername(String id);

}
