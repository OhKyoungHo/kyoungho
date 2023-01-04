package com.example.service;

import java.util.List;

import com.example.domain.EducationVO;

public interface SearchService {

   //교육과정이름 + 학원이름 서비스단 인터페이스
   public List<EducationVO> titleAndNameSearchQuery(String keyword);
   
   //키워드검색
   public List<EducationVO> detailsSearchQuery(String keywords);
   
   
 
}