package com.example.persistence;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.domain.ReviewVO;



public interface ReviewRepository extends JpaRepository<ReviewVO, Integer> {
   
   
   
   

   //리뷰가져오기용 + 리뷰페이징
   @Query(value = "SELECT *"
         + " FROM review WHERE ed_id=?1",
          countQuery = "SELECT count(*) FROM review  WHERE ed_id=?1",
          nativeQuery=true)
   Page<ReviewVO> getReviewAndPaging(Pageable paging, String re);
   
   
   
   
   //별점평균용
    @Query(value="SELECT ed_id, (ROUND(AVG(별))) AS avg "
          + "FROM review "
          + "GROUP BY ed_id "
          + "ORDER by avg DESC",  nativeQuery=true)
    List<Object[]>avgStar();
    
    
}