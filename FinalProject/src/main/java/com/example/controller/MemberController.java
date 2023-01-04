package com.example.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.MemberVO;
import com.example.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("insertMember")
	public String insertMember(MemberVO vo) {
		memberService.insertMember(vo);
		return "redirect:index";
	}
	
    @RequestMapping("loginMember")
    public String loginMember(MemberVO vo, HttpSession session) {
    	System.out.println(vo);
    	List<MemberVO> result = memberService.loginMember(vo);
    	System.out.println(result);
    	if (result != null) {
    		session.setAttribute("MId", vo.getMId());
    		return "redirect:/academy/index-2";
    	} else {
    		return "redirect:sign-in";
    	}
    	
    }
    
    @RequestMapping("logoutMember")
	public String logoutMember(HttpSession session) {
		session.removeAttribute("MId");
		return "redirect:/academy/index-2";
	}
    
}
