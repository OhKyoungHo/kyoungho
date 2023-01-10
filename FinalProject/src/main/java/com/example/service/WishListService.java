package com.example.service;


import java.util.List;

import com.example.domain.WishListVO;

public interface WishListService {
//	public int findLike(Integer edId, String memId);
//	public int saveLike(Integer edId, String memId);

		//위시리스트 추가
		//public void wishInsert(WishListVO vo);
		public void insertWish(String memId, Integer edId);
		
		//위시리스트 목록
		public List<WishListVO> getWishList(WishListVO vo);
		
		//위시리스트 삭제
		public void deleteWish(Integer wId);
		
		public WishListVO getWish(WishListVO vo);
		
	
		

	
}
