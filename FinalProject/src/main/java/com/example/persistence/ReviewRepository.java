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
   Page<ReviewVO> getReviewAndPaging(Pageable paging, String temp_ed_id);
   

   //리뷰가져오기용 + 리뷰페이징
   @Query(value = "SELECT *"
         + " FROM review WHERE ed_id=?1",
          countQuery = "SELECT count(*) FROM review  WHERE ed_id=?1",
          nativeQuery=true)
   Page<ReviewVO> getReviewAndPaging2(Pageable paging, String temp_ed_id);
   
   
   
   //경호형 추가
   //화상 리뷰가져오기용 + 리뷰페이징
   @Query(value = "SELECT *"
         + " FROM review WHERE vc_id=?1",
         countQuery = "SELECT count(*) FROM review  WHERE vc_id=?1",
         nativeQuery=true)
   Page<ReviewVO> getReviewAndPagingvc(Pageable paging, String re);

   
   
   
   //별점평균용
    @Query(value="SELECT ed_id, (ROUND(AVG(star))) AS avg "
          + "FROM review "
          + "GROUP BY ed_id "
          + "ORDER by avg DESC",  nativeQuery=true)
    List<Object[]>avgStar();
    

    
    //경호형추가
  //화상 별점평균용
     @Query(value="SELECT vc_id, (ROUND(AVG(star))) AS avg "
           + "FROM review "
           + "GROUP BY vc_id "
           + "ORDER by avg DESC",  nativeQuery=true)
     List<Object[]>avgStarvc();
     
     


    
     //마이페이지에 내가 쓴 리뷰 가져오기 !
     @Query(value = " SELECT * "
             + " FROM review "
             + " WHERE m_idint= 1339 ",
              countQuery = " SELECT count(*) "
                      + " FROM review "
                      + " WHERE m_idint= 1339 ", 
                      nativeQuery=true)
     Page<ReviewVO> getMyReview1(Pageable paging, String temp_m_idint);
    
}