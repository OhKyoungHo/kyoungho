package com.example.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.MemberVO;

public interface MemberRepository extends JpaRepository<MemberVO, Integer> {
	
	// 로그인
	List<MemberVO> findByMId(String mId);
	
}
