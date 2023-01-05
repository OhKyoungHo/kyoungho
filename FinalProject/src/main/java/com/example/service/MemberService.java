package com.example.service;

import java.util.List;

import com.example.domain.MemberVO;

public interface MemberService {
	
	// 회원가입
	void insertMember(MemberVO vo);

	// id 중복 체크
	public int mIdCheck(String MId);
	
	// 로그인
	List<MemberVO> loginMember(MemberVO vo);

}
