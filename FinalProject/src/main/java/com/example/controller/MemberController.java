package com.example.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.MemberVO;
import com.example.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	//회원가입
	@RequestMapping("insertMember")
	public String insertMember(MemberVO vo) {
		memberService.insertMember(vo);
		return "redirect:index";
	}
	
	
	// 로그인
    @RequestMapping("loginMember")
    public String loginMember(MemberVO vo, HttpSession session) {
    	System.out.println(vo);											// 로그인 할 때 생성되는 vo 확인
    	List<MemberVO> result = memberService.loginMember(vo);
    	System.out.println(result);										// 서비스 거쳐서 만들어진 vo 확인
    	if (result != null) {											//로그인 성공
    		session.setAttribute("MId", vo.getMId());
    		return "redirect:/academy/index-2";
    	} else {														//로그인 실패
    		return "redirect:sign-in";
    	}
    	
    }
    
    // 로그아웃
    @RequestMapping("logoutMember")
	public String logoutMember(HttpSession session) {
		session.removeAttribute("MId");
		return "redirect:/academy/index-2";
	}
    
    //아이디 중복 체크
    @RequestMapping(value="mIdCheck")
    @ResponseBody
    public String mIdCheck(String MId) {
    	System.out.println("아이디중복체크");
    	int result = memberService.mIdCheck(MId);
    System.out.println("중복체크------" + result);
    	return String.valueOf(result);
    
    }
    
}
