package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.EducationVO;
import com.example.service.EducationService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private EducationService eduService;
	
	//경호
//	//상품등록 페이지로 이동
//	@RequestMapping("/academyRegister")
//	public String itemRegister() {	
//		return "admin/academyRegister";
//	}
	//경호
	//상품목록 페이지로 이동
	@RequestMapping("/academyList")
	public String itemList(Model m) {	
		List<EducationVO> list = eduService.selectAllAcademy();
		m.addAttribute("result", list);
		return "admin/academyList";
	}

}
