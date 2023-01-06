package com.example.service;

import java.util.List;

import com.example.domain.MemberVO;

public interface MemberService {
	// 회원가입
	void insertMember(MemberVO vo);

	// id 중복 체크
	public int memIdCheck(String MemId);
	
	// 로그인
	List<MemberVO> loginMember(MemberVO vo);
	
	// 이름과 전화번호로 아이디 찾기
	public MemberVO findByMemTelAndMemName(MemberVO vo);
	
	// 임시 비밀번호 발송
	public Integer tempPw(MemberVO vo);

	// 아이디로 회원 정보 찾기
	public MemberVO findByMemId(MemberVO vo);
}
