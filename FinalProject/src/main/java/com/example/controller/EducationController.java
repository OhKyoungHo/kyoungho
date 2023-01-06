package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.EducationVO;
import com.example.domain.ReviewVO;
import com.example.persistence.EducationRepository;
import com.example.service.EducationService;
import com.example.service.ReviewService;


@Controller
@RequestMapping("/academy")
public class EducationController {

   @Autowired
   private EducationService eduService;

   @Autowired
   private EducationRepository eduRepo;

   //찬주추가
   @Autowired
   private ReviewService reviewService;

   
   
   

   //0106 학원리스트 출력 & 모든 검색부분 페이징 까지 완료 (경호+찬주)
   @GetMapping("/course-sidebar")
    //한페이지에 들어가는 수는 6개
    //@RequestParam 으로  order, keywords 받아와 사용가능
   public String getAcademyList(Model m, 
         @PageableDefault(size = 6, direction = Sort.Direction.DESC) Pageable paging, 
         @RequestParam(required = false, defaultValue = "") String order,
         @RequestParam(required = false, defaultValue = "") String keywords){


      //keywords 값 잘넘어옵니다 확인완료
      System.out.println("keywords 값 확인 : " + keywords);
      //order 값 잘 넘어옵니다 확인완료
      System.out.println("order 값 확인:"+ order);
      
      //만든쿼리 받아서 Page elist에 저장
      Page<EducationVO> elist = eduRepo.AllSearchAndPagingQuery(paging, keywords);

      //현재페이지
      int pageNumber=elist.getPageable().getPageNumber();
      //총페이지수
      int totalPages=elist.getTotalPages(); //검색에따라 10개면 10개..
      int pageBlock = 5; //블럭의 수 1, 2, 3, 4, 5   
      //시작하는 블록
      int startBlockPage = ((pageNumber)/pageBlock)*pageBlock+1; //현재 페이지가 7이라면 1*5+1=6
      //끝나는 블록
      int endBlockPage = startBlockPage+pageBlock-1; //6+5-1=10. 6,7,8,9,10해서 10.
      endBlockPage= totalPages<endBlockPage? totalPages:endBlockPage;

      //각 값들을 jsp 파일에 붙이기
      m.addAttribute("pageNumber", pageNumber);
      m.addAttribute("totalPages", totalPages);
      m.addAttribute("startBlockPage", startBlockPage);
      m.addAttribute("endBlockPage", endBlockPage);
      m.addAttribute("academyList", elist.getContent());
      //m.addAttribute("academyList", elist2.getContent());
      
      //하트부분 경호 추가
      long getTotalElements = elist.getTotalElements();
      m.addAttribute("getTotalElements", getTotalElements);
      
      //찬주 리스트 별점평균용
      Integer avg = reviewService.avgStar();
      //System.out.println("list.size():" + avg.size());   
      m.addAttribute("avg",avg);
      
      //리턴페이지의 디폴트 값
      return "academy/course-sidebar";
   }





   //0105
   //기존 겟보드에서 리뷰까지 나오기위해  찬주 추가
   @GetMapping("/course-details")
   public String getBoard(EducationVO vo, ReviewVO re, Model model){
      EducationVO result = eduService.getBoard(vo);
      String[] a = result.getEd_curriculum().split("\\+");

      model.addAttribute("title", a);
      model.addAttribute("education", result); // Model 정보 저장         

      //0105찬주 리뷰 출력용으로 ReviewVO 란 하나 추가함 !
      List<ReviewVO> reviewList = reviewService.getRV(re);
      System.out.println("list.size():" + reviewList.size());      
      model.addAttribute("reviewList", reviewList); 

      //찬주 상세 별점용
      Integer avg = reviewService.avgStar();
      //System.out.println("list.size():" + avg.size());   
      model.addAttribute("avg",avg);

      return "academy/course-details";



   }

}