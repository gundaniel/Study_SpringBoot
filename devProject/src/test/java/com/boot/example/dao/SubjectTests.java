package com.boot.example.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.boot.example.domain.SubjectVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class SubjectTests {
	
	@Setter(onMethod_ = @Autowired)
	private SubjectDAO subjectDAO;

	@Test
	public void subjectListTest() {
		log.info("--------------------------");
		log.info("subjectList()메서드 실행");
		List<SubjectVO> list = subjectDAO.subjectList();
//		for(SubjectVO vo : list) {
//			log.info(vo.toString());
		list.stream().forEach((subjectVO)->log.info(subjectVO.toString()));
	}
	
	
	@Test
	public void subjectNumberTest() {
		log.info("---------------------------------");
		log.info("subjectNumber()메서드 실행");
		String number = subjectDAO.subjectNumber();
		log.info(number);  
	}  
	
	@Test
	public void subjectInsertTest() {
		log.info("-------------------------");
		log.info("subjecInsert()메서드 실행");
		SubjectVO vo = new SubjectVO();
		vo.setSubjectNumber(subjectDAO.subjectNumber());
		vo.setSubjectName("문화재보존과");
		int result = subjectDAO.subjectInsert(vo);
		log.info(String.valueOf(result));
				
	}
}
	
