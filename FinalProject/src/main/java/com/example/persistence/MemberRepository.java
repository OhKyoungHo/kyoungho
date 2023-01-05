package com.example.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.MemberVO;

public interface MemberRepository extends JpaRepository<MemberVO, Integer> {
	
	// 로그인
	List<MemberVO> findByMIdAndMPass(String mId, String MPass);
	
	// 아이디 중복 체크
	int countByMId(String mId);
	
}
