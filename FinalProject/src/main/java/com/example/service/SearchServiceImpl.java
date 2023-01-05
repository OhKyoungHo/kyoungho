package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.EducationVO;
import com.example.persistence.SearchRepository;

@Service
public class SearchServiceImpl implements SearchService {
   
   @Autowired
   private SearchRepository searchRepository;
   
   
   //교육과정이름 + 학원이름
   @Transactional
   public List<EducationVO> titleAndNameSearchQuery(String keyword){
     
      List<EducationVO> searchList = searchRepository.titleAndNameSearchQuery(keyword);
      return searchList;
   }
   

   //키워드검색
   @Transactional
   public List<EducationVO> detailsSearchQuery(String keywords){
     
      List<EducationVO> searchList2 = searchRepository.detailsSearchQuery(keywords);
      return searchList2;
   }
   
   
   //최신등록순 정렬
   @Transactional
   public List<EducationVO> newDate(String newdate){
     
      
      List<EducationVO> searchList3 = searchRepository.newDate(newdate);
      
      System.out.println("서비스임풀 : " + searchList3);
      return searchList3;
      
   }
  
   
   
   

}