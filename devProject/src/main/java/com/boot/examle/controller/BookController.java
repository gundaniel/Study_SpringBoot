package com.boot.examle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.example.domain.BookVO;
import com.boot.example.service.BookService;

import lombok.Setter;

@Controller
@RequestMapping("/books")
public class BookController {
	@Setter(onMethod_ = @Autowired)
	private BookService bookService;
	
	@GetMapping("/bookList")
	public String bookList(Model model, BookVO bookVO) {
		List<BookVO> bookList = bookService.bookList();
		model.addAttribute("bookList", bookList);
		
		String number = bookService.bookId();
		bookVO.setBookId(number);
		model.addAttribute("bookVO", bookVO);
		
		return "books/bookList";
	}
	
	@PostMapping("/bookInsert")
	public String subjectInsert(BookVO bookVO) {
		bookService.bookInsert(bookVO);
		return "redirect:/books/bookList";
	}
}
