package com.callor.naver.controller;

import java.util.ArrayList;
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
		List<BookVO> bookList = new ArrayList<>();

		if (word != null && !word.isBlank()) {
			bookList = bookService.findByWord(word);
		}

		for (BookVO one : bookList) {
			if (bookDao.findByisbn(one.getIsbn()) == null) {
				bookDao.insert(one);
			}
		}

		model.addAttribute("BOOKLIST", bookList);
		return "book/search";
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(String isbn, Model model) {

		BookVO bookVO = bookDao.findByisbn(isbn);
		model.addAttribute("BOOK", bookVO);

		return "book/detail";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return "book/add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(BookVO bookVO) {
		if (bookDao.findByisbn(bookVO.getIsbn()) == null) {
			bookDao.insert(bookVO);
		}

		return "redirect:/book";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(String isbn) {
		bookDao.delete(isbn);
		return "redirect:/book";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(String isbn, Model model) {
		BookVO bookVO = bookDao.findByisbn(isbn);
		model.addAttribute("BOOK", bookVO);
		return "book/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(BookVO bookVO) {
		bookDao.update(bookVO);
		return "redirect:/book/detail?isbn=" + bookVO.getIsbn();
	}

}
