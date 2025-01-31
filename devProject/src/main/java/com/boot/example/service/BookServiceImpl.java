package com.boot.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.example.dao.BookDAO;
import com.boot.example.domain.BookVO;

import lombok.Setter;

@Service
public class BookServiceImpl implements BookService {
	@Setter(onMethod_ = @Autowired)
	private BookDAO bookDAO;
	
	
	@Override
	public List<BookVO> bookList(){
	List<BookVO> list = bookDAO.bookList();
	return list;
	}

	@Override
	public String bookId() {
		String bookId = bookDAO.bookId();
		return bookId;
	}

	@Override
	public int bookInsert(BookVO bookVO) {
		int result = bookDAO.bookInsert(bookVO);
		return result;
	}

} 
