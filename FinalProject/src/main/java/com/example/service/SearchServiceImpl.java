package com.example.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.EducationVO;
import com.example.persistence.SearchRepository;

@Service
public class SearchServiceImpl implements SearchService {
   
   @Autowired
   private SearchRepository searchRepo;
   
   
   
   @Transactional
   public List<EducationVO> search(String keyword) {
      System.out.println("keyword : " + keyword );
      List<EducationVO> postlist = searchRepo.findByEdTitleContaining(keyword);
      System.out.println(postlist);
      return postlist;
      
   }
   
}