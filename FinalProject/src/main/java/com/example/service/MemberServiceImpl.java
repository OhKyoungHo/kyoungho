package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.MemberVO;
import com.example.persistence.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberRepository memberRepository;

	//회원가입
	@Override
	public void insertMember(MemberVO vo) {
		memberRepository.save(vo);
	}

	//로그인
	@Override
	public List<MemberVO> loginMember(MemberVO vo) {
		return memberRepository.findByMIdAndMPass(vo.getMId(), vo.getMPass());
	}

	//아이디 중복 체크
	@Override
	public int mIdCheck(String MId) {
		System.out.println(MId);
		int result = memberRepository.countByMId(MId);
		System.out.println(result);
		return result;
	}
	
	




	
}
