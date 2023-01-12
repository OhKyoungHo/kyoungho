package com.example.controller;

import java.util.List;



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
	public void insertWish(Integer memIdint, Integer edId) {
		System.out.println("memId : " + memIdint + ", edId : " +edId);
		wishService.insertWish(memIdint, edId);
	}
	
	@RequestMapping("/delete")
	public void deleteWish(Integer memIdint, Integer edId) {
	
		wishService.deleteWish(memIdint, edId);
	};


}
