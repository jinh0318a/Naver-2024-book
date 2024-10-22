package com.callor.naver.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponse {
	private String lastBuildDate;
	private int total;
	private int start;
	private int display;
	private List<BookVO> items;
}
