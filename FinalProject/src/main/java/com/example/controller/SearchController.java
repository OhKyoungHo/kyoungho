package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.EducationVO;
import com.example.service.SearchService;

//0102검색을 위한 컨트롤러
@Controller
@RequestMapping("/academy")
public class SearchController {
   
   @Autowired
   private SearchService searchService;
   
   
   //index-2 검색부분 form태그 액션값타고 들어옴
    @GetMapping("/mainsearch")
    public String search(String keyword, Model model) {
       
       //keyword 넘어오나 확인용
       System.out.println("[SearchController] : /academy/mainsearch 요청 :" + keyword );
       
       //academyList라는 이름으로 사용하기위해 model로 넘기기
        List<EducationVO> list = searchService.search(keyword);
        model.addAttribute("academyList", list);
        
        //view로 마지막 페이지 지정
        return "/academy/course-sidebar";
    }


   
   

}