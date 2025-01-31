package com.boot.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookVO {
	private String bookId;
	private String title;
	private String publisher;
	private String year;
	private String price;
	
}
