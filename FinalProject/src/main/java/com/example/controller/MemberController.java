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
	@RequestMapping("/insertMember")
	public String insertMember(MemberVO vo) {
		System.out.println(vo);	//회원가입 할 때 생성되는 vo
		memberService.insertMember(vo);	
		return "redirect:index";	
	}
	
	//로그인
    @RequestMapping("/loginMember")
    public String loginMember(MemberVO vo, HttpSession session) {
    	System.out.println(vo); //로그인 할 때 생성되는 vo
    	List<MemberVO> result = memberService.loginMember(vo);	
    	System.out.println(result); //서비스 거쳐서 만들어진 vo
    	if (!result.isEmpty()) {	//로그인 
    		session.setAttribute("memId", vo.getMemId());
    		return "redirect:academy/index-2";
    	} else {	//로그인 실패
    		return "redirect:sign-in";
    	}
    	
    }
    //로그아웃
    @RequestMapping("logoutMember")
	public String logoutMember(HttpSession session) {
		session.removeAttribute("memId");
		return "redirect:/academy/index-2";
	}
    
    //아이디 중복 체크
    @RequestMapping(value="mIdCheck")
    @ResponseBody	//ajax 쓸 때 필요
    public String memIdCheck(String memId) {
    	System.out.println("아이디중복체크");
    	int result = memberService.memIdCheck(memId);
    System.out.println("중복체크------" + result);
    	return String.valueOf(result);
    
    }
    
    //아이디 찾기
    @RequestMapping(value="findId")
    @ResponseBody	//ajax 쓸 때 필요
    public String findId(MemberVO vo) {
		//System.out.println(vo.getMemName()+vo.getMemTel());
    	String id = null;
		MemberVO result = memberService.findByMemTelAndMemName(vo);	
		if (result != null) {
			id = result.getMemId();
			return id;
		} else {
			id = "0";
			return id;
		}

	}
    
    //비밀번호 찾기
    @RequestMapping(value="findPw")
    @ResponseBody	//ajax 쓸 때 필요
    public String findPw(MemberVO vo) {
    	String message = null;
    	MemberVO result = memberService.findByMemId(vo);
    	if (result != null) {
    		System.out.println("1");
    		Integer mailResult = memberService.tempPw(result);
    		System.out.println("2:" + mailResult); // 1이면 디비에 임시비밀번호가 저장
    		message= result.getMemId() + "님의 이메일인" + result.getMemEmail() + "로 임시 비밀번호를 전송해 드렸습니다.";
    		System.out.println("3:" + message);
    		return message;
    	}else {
    		message = "일치하는 정보가 없습니다.";
    		return message;
    	}
    }
    
}
