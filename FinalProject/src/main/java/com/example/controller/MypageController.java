package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.TeacherVO;
import com.example.persistence.TeacherRepository;
import com.example.service.TeacherService;


@Controller
@RequestMapping("/mypage")
public class MypageController {

	
	
	  @Autowired
	   private TeacherService teacherService;
	  
	  
	  @Autowired
	   private TeacherRepository teacherRepository;

	   
	

	  
	  //등록하기전에 그냥 화면보이기용 등록함수와 이함수를 2개를 둬야함 
	  @GetMapping("/tutorInsert")
	  public String tutorPageView() {
		  return  "/mypage/tutorInsert";
		  
	  }
	  
	   
	  
	  //선생님 등록용
	   @PostMapping("/tutorInsert")
		public String insertTeacher(TeacherVO tvo) {
		System.out.println("인설트 티처 확인" + tvo); 
		   
		teacherService.insertTeacher(tvo);
		
		   
			return "redirect:/mypage/tutorInsert";   
		}


	   
	   
	
}
