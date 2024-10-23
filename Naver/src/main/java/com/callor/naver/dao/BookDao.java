package com.callor.naver.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.callor.naver.model.BookVO;

@Repository
public interface BookDao {

	public int insert(BookVO bookVO);

	public int update(BookVO bookVO);

	@Delete("delete from tbl_books where isbn=#{isbn}")
	public int delete(String isbn);

	@Select("select * from tbl_books")
	public List<BookVO> selectAll();

	@Select("select * from tbl_books where isbn=#{isbn}")
	public BookVO findByisbn(String isbn);

}
