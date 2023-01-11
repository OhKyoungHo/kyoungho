package com.example.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.domain.ReviewVO;
import com.example.persistence.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {


   @Autowired
   private ReviewRepository reviewRepository;


   //작성한 리뷰 값 등록하기
   public void saveRV(ReviewVO vo) {
      reviewRepository.save(vo);
   };


   //별점 평균값
   @Transactional
   public  List<Object[]> avgStar(){

      List<Object[]> avgStar = reviewRepository.avgStar();
      return avgStar;        
   }

   






}