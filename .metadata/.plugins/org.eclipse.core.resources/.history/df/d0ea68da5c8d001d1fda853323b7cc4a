package com.example.persistence;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.EducationVO;

public interface EducationRepository extends CrudRepository<EducationVO, Integer>{

   //Pageable : Pagination 요청 정보를 담기위한 추상 인터페이스
   //Education 테이블을 페이징하는 메서드
   //전체검색을 페이징
   Page<EducationVO> findAll(Pageable paging);
   
}