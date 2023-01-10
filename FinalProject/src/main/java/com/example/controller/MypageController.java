package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.domain.WishListVO;
import com.example.persistence.WishListRepository;
import com.example.service.WishListServiceImpl;

@Controller
@RequestMapping("/mypage")
public class MypageController {

	@Autowired
	private WishListRepository wishRepo;
	@Autowired
	private WishListServiceImpl wishService;


	@RequestMapping("/wishlistaca")
	public void wishListaca(Model m, WishListVO vo) {
		List<WishListVO> list = wishRepo.getWishList(vo);
		m.addAttribute("wishList", list);

	}


//	@RequestMapping("/insert")
//	public void wishInsert(WishListVO vo) {
//		System.out.println("vo : "+vo);
//		wishService.wishInsert(vo);
//	}
	
	@RequestMapping("/insert")
	public void insertWish(String memId, String edId) {
		Integer edId2 = Integer.parseInt(edId);
		System.out.println("memId : " + memId + ", edId : " +edId2);
		wishService.insertWish(memId, edId2);
	}
	
	@RequestMapping("/delete")
	public void deleteWish(Integer wId) {
		
		System.out.println( wId + "삭제완료");
		wishService.deleteWish(wId);
	};


}
