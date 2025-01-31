package com.boot.example.service;

import java.util.List;

import com.boot.example.domain.SubjectVO;

public interface SubjectService {

	List<SubjectVO> subjectList();
	String subjectNumber();
	public int subjectInsert(SubjectVO subjectVO);

}
