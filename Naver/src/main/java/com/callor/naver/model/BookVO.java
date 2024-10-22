package com.callor.naver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookVO {

	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private int discount;
	private String description;
	private String pubdate;
	private String link;
	private String image;

}
