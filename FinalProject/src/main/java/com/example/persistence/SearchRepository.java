package com.example.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.domain.EducationVO;

public interface SearchRepository extends JpaRepository<EducationVO, Integer> {
   
   //교육과정이름 + 학원이름 으로 각각 검색가능하게 만듬
      //마리아디비는 문자열 연결할때 CONCAT을 사용합시다!
   @Query(value="SELECT *  "
            + "FROM education "
            + "WHERE ed_title LIKE CONCAT('%',?1,'%') "
            + "OR ed_name LIKE CONCAT('%',?1,'%') ", nativeQuery=true)
   List<EducationVO> titleAndNameSearchQuery(String keyword);
   
   
   
   //카테고리로 검색
   @Query(value="SELECT *  "
         + "FROM education "
         + "WHERE lower(ed_title) LIKE CONCAT('%',?1,'%')", nativeQuery=true)
    List<EducationVO> detailsSearchQuery(String keywords);
   

   
   @Query(value = "SELECT * "
         + "FROM education "
         + "ORDER BY ed_days DESC", nativeQuery=true)
   List<EducationVO> newDate(String newdate);
  
   
}