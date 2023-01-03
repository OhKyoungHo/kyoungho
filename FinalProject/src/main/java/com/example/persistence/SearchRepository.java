package com.example.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.EducationVO;

public interface SearchRepository extends JpaRepository<EducationVO, Integer> {
   
   List<EducationVO> findByEdTitleContaining(String keyword);

}