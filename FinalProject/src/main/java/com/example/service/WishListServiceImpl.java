package com.example.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.EducationVO;
import com.example.domain.MemberVO;
import com.example.domain.WishListVO;
import com.example.persistence.WishListRepository;

@Service
public class WishListServiceImpl implements WishListService {

	@Autowired
	private WishListRepository wishRepo;

	/*
	//위시리스트 추가
	// 클라이언트에서 넘어오는 파라미터
	//	String memId : MemberVO 
	//  Integer edId : EducationVO
	public void wishInsert(MemberVO mvo, EducationVO evo) {
		WishListVO wvo = new WishListVO();
		wvo.setMemId(mvo);
		wvo.setEdId(evo);
		
		
		wishRepo.save(wvo);
	};
	*/
	public void insertWish(String memId, Integer edId) {
		wishRepo.insertWish(memId, edId);
	};
	

	//위시리스트 목록
	public List<WishListVO> getWishList(WishListVO vo){
		return wishRepo.getWishList(vo);
	};

	//위시리스트 삭제
	public void deleteWish(Integer wId){
		wishRepo.deleteById(wId);
	};
	
	public WishListVO getWish(Integer wId, String memId) {
		//optional에서 값만 가져와야해서 get써줌
		return wishRepo.getWish(wId, memId);
	}

}
