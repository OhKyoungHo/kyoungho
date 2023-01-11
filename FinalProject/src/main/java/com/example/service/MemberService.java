package com.example.service;

import java.util.HashMap;
import java.util.List;

import com.example.domain.MemberKakaoDTO;
import com.example.domain.MemberVO;

public interface MemberService {
	// 회원가입
	void insertMember(MemberVO vo);

	// id 중복 체크
	public int memIdCheck(String memIdString);
	
	// 로그인
	List<MemberVO> loginMember(MemberVO vo);
	
	//카카오 로그인
	public String getAccessToken(String code);
	public MemberKakaoDTO getUserInfo(String access_Token);
	
	// 이름과 전화번호로 아이디 찾기
	public MemberVO findByMemTelAndMemName(MemberVO vo);
	
	// 임시 비밀번호 발송
	public Integer tempPw(MemberVO vo);

	// 아이디로 회원 정보 찾기
	public MemberVO findByMemIdString(MemberVO vo);


	
	
	

}
