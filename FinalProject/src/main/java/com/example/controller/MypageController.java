package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.WishListVO;
import com.example.persistence.WishListRepository;

@Controller
@RequestMapping("/mypage")
public class MypageController {
	
	@Autowired
	private WishListRepository wishRepo;
	
	
	@RequestMapping("/wishlistaca")
	public void wishListaca(Model m) {
	  m.addAttribute("wishList", wishRepo.getWishList());
	  
	}

}
