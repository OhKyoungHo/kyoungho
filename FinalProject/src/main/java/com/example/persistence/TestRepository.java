package com.example.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.MemberVO;

public interface TestRepository extends JpaRepository<MemberVO, Integer> {
	
	
	
}
