package com.example.service;

import java.util.List;

import com.example.domain.EducationVO;

public interface SearchService {
   public List<EducationVO> search(String keyword);
}