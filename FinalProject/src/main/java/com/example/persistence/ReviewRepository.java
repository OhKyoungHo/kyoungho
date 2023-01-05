package com.example.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.domain.ReviewVO;



public interface ReviewRepository extends JpaRepository<ReviewVO, Integer> {

   
   
   
    @Query(value="SELECT ROUND(AVG(star)) AS avg FROM review", nativeQuery=true)
    Integer avgStar();
   
      
}