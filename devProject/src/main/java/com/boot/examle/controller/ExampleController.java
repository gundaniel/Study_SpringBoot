package com.boot.examle.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.example.domain.ExampleDTO;
import com.boot.example.domain.SampleDTO;
import com.boot.example.domain.SampleDTOList;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
		//요청 url= http://localhost:8080/example/exam01
	
		@GetMapping("/exam01")
		public String exam01(Model model){
			model.addAttribute("data","안녕하세요");
			return "/example/exam01"; //파일명 문자출력(x)
		}
		
//------------------------------------------------
		@GetMapping("/test")
		public String test(Model model) {
			model.addAttribute("text1", "This page was used for testing.");
			model.addAttribute("text2", "This is to <strong>show</strong> you");
			
			model.addAttribute("text3", null);
			model.addAttribute("text4", "Welcome to Spring");
			
			model.addAttribute("number3", 3);
			
			model.addAttribute("text6", "hey mr.kim seogeon");
			
			
			ExampleDTO exampleDTO = new ExampleDTO();
			exampleDTO.setName("김서건");
			exampleDTO.setAge(32);
			exampleDTO.setEmail("javauser@naver.com");
			model.addAttribute("exampleDTO",exampleDTO);
			
			List<ExampleDTO> list = new ArrayList<>();
			list.add(new ExampleDTO("김서건",32,"javauser@naver.com"));
			list.add(new ExampleDTO("홍길동",38,"javauser@naver.com"));
			model.addAttribute("list",list);
			
			Map<Integer, ExampleDTO> map  = new HashMap<>();
			map.put(1, new ExampleDTO("김미숙",30,"javauser@naver.com"));
			map.put(2, new ExampleDTO("조한미",32,"bootuser@naver.com"));
			model.addAttribute("map", map);
		
			model.addAttribute("localDateTime", LocalDateTime.now());
			
			return "example/test";
		}
			  
			/*  요청방법: http://localhost:8080/example/exam03? name=홍길동&age=25 */
		@GetMapping("/exam03")
//		public String exam03(@RequestParam String name, @RequestParam int age, Model model) {
//			model.addAttribute("name", name);
//			model.addAttribute("age", age);
				
		public String exam03(@RequestParam String name,
			@RequestParam(required = false, defaultValue = "0") int age,
			Model model) {
				model.addAttribute("name", name);
				model.addAttribute("age", age);
			return "example/exam03";
		}
		  
//전달받은 데이터를 @ModelAttribute로 전달한다.
		@PostMapping("/exam04")
		public String exam04(@ModelAttribute SampleDTO dto, Model model) {
			model.addAttribute("dto", dto);
//		public String exam04(@ModelAttribute SampleDTO dto) {
			return "example/exam04";
		} 
		  
		@PostMapping("/exam04Array")
//		public String exam04Array(@RequestParam String[] hobby, Model model) {
			public String exam04List(@RequestParam ArrayList<String> hobby, Model model) {
			model.addAttribute("hobbyList", hobby);
			return "example/exam04Array"; 
		}
		  
		@PostMapping("/exam04Bean")
		public String exam04Bean(@ModelAttribute SampleDTOList list) {
		    return "example/exam04Bean"; // 
		}
		
		@GetMapping("/exam05")
		@ResponseBody //리턴하는 값이 뷰가 아닌 문자 자체로 선언
		public String exam05() {
			return "오늘도 최선을 다해";
		}
		
		
		
		 
		
		   
}

 
