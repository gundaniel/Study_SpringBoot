package com.boot.examle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.example.domain.SubjectVO;
import com.boot.example.service.SubjectService;

import lombok.Setter;

@Controller
@RequestMapping("/subject")
public class SubjectController { 
	@Setter(onMethod_ = @Autowired)
	 private SubjectService subjectService;
	
	@GetMapping("/subjectList")
	public String subjectList(Model model, SubjectVO subjectVO) {
		List<SubjectVO> subjectList = subjectService.subjectList();
		model.addAttribute("subjectList", subjectList);
		
		//자동학과번호 추출
		String number = subjectService.subjectNumber();
		subjectVO.setSubjectNumber(number);
		model.addAttribute("subjectVO", subjectVO);
		
		return "subject/subjectList";
	}
	
	@PostMapping("/subjectInsert")
	public String subjectInsert(SubjectVO subjectVO) {
		subjectService.subjectInsert(subjectVO);
		return "redirect:/subject/subjectList";
	}
	
}
