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

   //찬주
    //교육과정이름 + 학원이름 메인단에서 검색가능하게 구현
    //index-2.jsp 에서 /mainsearch form태그 액션값으로 들어옵니다
    @GetMapping("/mainsearch")
    public String mainSearch(String keyword, Model model) {
       //keyword 넘어오나 확인용
        System.out.println("[SearchController] : /academy/mainsearch 요청 :" + keyword );
        
        //널이아니면 조건검색 시작
        if(keyword != null) {
           List<EducationVO> searchList = searchService.titleAndNameSearchQuery(keyword);
            System.out.println("list.size():" + searchList.size());
            model.addAttribute("academyList", searchList);   
        }else { //널이면 전체리스트로 리다이렉트
           
           return "redirect:/academy/course-sidebar";
        }
        return "/academy/course-sidebar";
    }
    
    
    
    //카테고리 검색용
    @GetMapping("/detailsSearch")
    public String detailsSearch(String keywords, Model model) {
        System.out.println("[SearchController] : /academy/mainsearch 요청 :" + keywords );
        
        List<EducationVO> searchList2 = searchService.detailsSearchQuery(keywords);
        System.out.println("list.size():" + searchList2.size());
        model.addAttribute("academyList", searchList2);  
        
        return "/academy/course-sidebar";
    }
    
   
    //최신등록순 정렬
    @GetMapping("/newSearch")
    public String newDate(String newdate, Model model) {
        System.out.println("[SearchController] : /academy/newSearch 요청 :" + newdate);
        
        List<EducationVO> searchList3 = searchService.newDate(newdate);
        System.out.println("list.size()확인:" + searchList3.size());
        model.addAttribute("academyList", searchList3);  
        
        return "/academy/course-sidebar";
    }
        
    




   
   

}