package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.MemberVO;
import com.example.persistence.TestRepository;
import com.example.persistence.TestRepository;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	TestRepository testRepository;

	@Override
	public void insertTest(MemberVO vo) {
		testRepository.save(vo);
	}

}
