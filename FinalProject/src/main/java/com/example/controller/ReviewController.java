package com.example.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.ReviewVO;
import com.example.persistence.ReviewRepository;
import com.example.service.ReviewService;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Controller
@RequestMapping("/academy")
public class ReviewController {


   
     @Autowired
     private ReviewService reviewService;
     
     @Autowired
     private ReviewRepository  reviewRepository;

     //리뷰 등록부분 (안되면리퀘스트 매핑으로)
     @GetMapping("/insertRV")
     @ResponseBody //ajax 쓰려고 리퀘스트 바디
     public String insertRV(ReviewVO vo, 
           @RequestParam String edId,@PageableDefault(size = 6) Pageable paging,String re) {
        System.out.println("리뷰뷰뷴 : " +   vo);
        
        reviewService.saveRV(vo);
        
       
        
        //가져오는거 넣기
        String temp_ed_id = String.valueOf(vo.getEdId());
        System.out.println(temp_ed_id);
        Page<ReviewVO> list = reviewRepository.getReviewAndPaging(paging,temp_ed_id );
        List<ReviewVO> reviewList = list.getContent();
        Gson gson = new Gson();
        JsonArray jArray = new JsonArray();
        
        System.out.println("겟컨확인"+ reviewList.size());
         //for(int i=0 ; i<reviewList.size(); i++) {
        for( ReviewVO rvo : reviewList ) {
            
            JsonObject object = new JsonObject();
            
            
            object.addProperty("Mid", String.valueOf(rvo.getMemIdInt()));
            object.addProperty("star", String.valueOf(rvo.getStar()));
            object.addProperty("reDate", String.valueOf(rvo.getReDate()));
            object.addProperty("reContent", String.valueOf(rvo.getReContent()));
            
            
            jArray.add(object);
            //System.out.println("잘붙었나?");
         }
         
         String json = gson.toJson(jArray);
        // select
        // json
        // 문자열로 변환해서 리턴
         System.out.println("json의 값은???" + json);
         return json ;   //리턴 ok값은 섯세스의 리절트라는 이름으로 보내봄  
     }//end of insertRV
     
     
   
     
   
     
}
     
     
     