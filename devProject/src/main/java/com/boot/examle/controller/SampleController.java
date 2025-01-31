package com.boot.examle.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.example.domain.ExampleVO;

import lombok.extern.slf4j.Slf4j;


/**************************************************************
 * 참고 : @RestController (@Controller + @ResponesBody)
 * Controller가 REST 방식을 처리하기 위한 것임을 명시. 
 * (기존의 특정한 뷰를 만들어 내는 것이 목적이 아닌 REST 방식의 데이터 처리를 위해서 사용하는(데이터 자체를 반환) 어노테이션이다.
 * @ResponesBody: 일반적인 뷰로 전달되는 게 아니라 데이터 자체를 전달하기 위한 용도이다.
 * @PathVariable: URL 경로에 있는 값을 파라미터로 추출하려고 할 때 사용한다.
 * @RequestBody: JSON 데이터를 원하는 타입으로 바인딩 처리한다.
 **************************************************************/


@RestController
@RequestMapping("/sample/*") 
@Slf4j
public class SampleController {
	@GetMapping(value = "/getText", produces ="text/plain; charset=UTF-8")
	public String getText() {
		log.info("MINE TYPE: " + MediaType.TEXT_PLAIN_VALUE);
	
		return "안녕하세요";
	}
	
	@GetMapping(value = "/getExample", produces = MediaType.APPLICATION_JSON_VALUE)
	public ExampleVO getSample() {
		return new ExampleVO(1, "홍길동", "010-1234-5678");
	}
	
	@GetMapping(value = "/getExample2", produces = MediaType.APPLICATION_XML_VALUE)
	public ExampleVO getSample2() {
		return new ExampleVO(2, "김철수", "010-8765-4321");
	}
	
	@GetMapping("/getExample3")
	public ExampleVO getExample3() {
	 ExampleVO exampleVO = new ExampleVO();
	 exampleVO.setNo(3);
	 exampleVO.setName("김서건");
	 exampleVO.setPhone("010-8297-3315");
		
	 return exampleVO;
	}
	
	@GetMapping(value = "/getList", produces = MediaType.APPLICATION_JSON_VALUE)
		public List<ExampleVO> getLIst(){
		List<ExampleVO> list = new ArrayList<>();
		list.add(new ExampleVO(1, "홍길동", "010-1234-5678"));
		list.add(new ExampleVO(2, "한늘봄", "010-8765-4321"));
		list.add(new ExampleVO(3, "이진희", "010-56748-1234"));
		list.add(new ExampleVO(4, "박철희", "010-4321-8765"));

		return list;
	}
	
	@GetMapping(value = "/getMap", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, ExampleVO> getMap(){
		Map<String, ExampleVO> map = new HashMap<>();
		map.put("First", new ExampleVO(5, "이진수", "010-2356-3390"));
		
		return map;
	}
	
	
	 
	
	
	
	
}
