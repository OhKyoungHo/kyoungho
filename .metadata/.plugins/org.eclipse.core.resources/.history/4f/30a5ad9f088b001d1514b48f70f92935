package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.EducationVO;
import com.example.service.EducationService;

@Controller
@RequestMapping("/academy")
public class EducationController {
	
	@Autowired
	private EducationService eduService;
	
	@RequestMapping("/course-sidebar")
	public void getBoardList(Model m) {
		EducationVO vo = new EducationVO();
		List<EducationVO> list = eduService.getBoardList(vo);
		System.out.println(list);
		System.out.println("[Controller:getBoardList 요청] 결과갯수 : " + list.size());
		
		m.addAttribute("academyList", list);
	}
	
	@RequestMapping("/course-details")
	public void getBoard(EducationVO vo, Model model) {
		model.addAttribute("education", eduService.getBoard(vo)); // Model 정보 저장			
	}

}
