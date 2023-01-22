package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.persistence.WishListRepository;

@Controller
public class ViewController {
	@Autowired
	private WishListRepository wishRepo;
	
	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		return step;
	}
	
	@RequestMapping("/academy/{step}")
	public String viewAcademy(@PathVariable String step, Model m, HttpSession session) {
		Integer memIdInt = (Integer) session.getAttribute("memIdInt");
		List<Object[]> list = wishRepo.findByMemIdInt(memIdInt);
		m.addAttribute("wishList", list);
		return "/academy/"+step;
	}
	
	@RequestMapping("/admin/{step}")
	public String viewAdmin(@PathVariable String step) {
		return "/admin/"+step;
	}
	
	@RequestMapping("/lecture/{step}")
	public String viewLecture(@PathVariable String step) {
		return "/lecture/"+step;
	}
	

	@RequestMapping("/mypage/{step}")
	public String viewMyPage(@PathVariable String step) {
		return "/mypage/"+step;
	}
	
	@RequestMapping("/board/{step}")
	public String viewBoard(@PathVariable String step) {
		return "/board/"+step;
	}
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
