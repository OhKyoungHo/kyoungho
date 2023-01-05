package com.example.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.ReviewVO;
import com.example.service.ReviewService;

@Controller
@RequestMapping("/academy")
public class ReviewController {

   
   
   
     @Autowired
     private ReviewService reviewService;

     //리뷰 등록부분
     @RequestMapping("/insertRV")
     public String insertRV(ReviewVO vo, @RequestParam String edId) {
        System.out.println("리뷰뷰뷴 : " +   vo);
        
        vo.setReDate(LocalDateTime.now());
        
        reviewService.saveRV(vo);
         return "redirect:/academy/course-details?edId=" + edId;
     }
     
    /*
     //리뷰정보 가져오기
     @RequestMapping("/getRV")
     public String getRV(ReviewVO vo,  Model model) {
        System.out.println("리뷰얻어왔나 확인용 : " +   vo);
        
        List<ReviewVO> reviewList = reviewService.getRV(vo);
         System.out.println("list.size():" + reviewList.size());
         
        model.addAttribute("reviewList", reviewList); 
        return "redirect:/academy/course-details";
     }
     */
     

     
}
     
     
     