package com.boot.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter //설정자
@Getter //접근자
@NoArgsConstructor //default 생성자
@AllArgsConstructor //값이 있는 생성자
@ToString
public class ExampleDTO {
	private String name;
	private int age;
	private String email;
}
