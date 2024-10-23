package com.callor.naver.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.naver.dao.BookDao;
import com.callor.naver.dao.UserDao;
import com.callor.naver.model.BookVO;

@Controller
public class HomeController {

	private final BookDao bookDao;
	private final UserDao userDao;

	public HomeController(BookDao bookDao, UserDao userDao) {
		super();
		this.bookDao = bookDao;
		this.userDao = userDao;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<BookVO> bookList = bookDao.selectAll();

		model.addAttribute("BOOKLIST", bookList);
		return "home";
	}

}
