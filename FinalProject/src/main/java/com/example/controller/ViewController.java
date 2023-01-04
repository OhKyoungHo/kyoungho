package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		return step;
	}
	
	@RequestMapping("/academy/{step}")
	public String viewAcademy(@PathVariable String step) {
		return "/academy/"+step;
	}
	
	@RequestMapping("/admin/{step}")
	public String viewAdmin(@PathVariable String step) {
		return "/admin/"+step;
	}
	
//	@RequestMapping("/lecture/{step}")
//	public String viewLecture(@PathVariable String step) {
//		return "/lecture/"+step;
//	}
//	
//	@RequestMapping("/mypage/{step}")
//	public String viewMyPage(@PathVariable String step) {
//		return "/mypage/"+step;
//	}
//	
//	@RequestMapping("/pay/{step}")
//	public String viewPay(@PathVariable String step) {
//		return "/pay/"+step;
//	}
//	
//	@RequestMapping("/signup/{step}")
//	public String viewSignUp(@PathVariable String step) {
//		return "/signup/"+step;
//	}
	
	
	
}
