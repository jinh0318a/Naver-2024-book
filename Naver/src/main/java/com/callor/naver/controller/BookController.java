package com.callor.naver.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.naver.dao.BookDao;
import com.callor.naver.model.BookVO;
import com.callor.naver.service.BookService;

@RequestMapping("/book")
@Controller
public class BookController {

	private final BookService bookService;
	private final BookDao bookDao;

	public BookController(BookService bookService, BookDao bookDao) {
		super();
		this.bookService = bookService;
		this.bookDao = bookDao;
	}

	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public String list(Model model) {

		List<BookVO> bookList = bookDao.selectAll();

		model.addAttribute("BOOKLIST", bookList);
		return "book/list";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(String word, Model model) {
		List<BookVO> bookList = bookService.findByWord(word);

		for (BookVO one : bookList) {
			if (bookDao.findByisbn(one.getIsbn()) == null) {
				bookDao.insert(one);
			}
		}

		model.addAttribute("BOOKLIST", bookList);
		return "book/search";
	}

}
