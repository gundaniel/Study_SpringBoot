package com.boot.example.service;

import java.util.List;

import com.boot.example.domain.BookVO;

public interface BookService {
	List<BookVO> bookList();
	String bookId();
	public int bookInsert(BookVO bookVO);

}
