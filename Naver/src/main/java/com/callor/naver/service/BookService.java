package com.callor.naver.service;

import java.util.List;

import com.callor.naver.model.BookVO;

public interface BookService {

	public List<BookVO> findByWord(String word);
}
