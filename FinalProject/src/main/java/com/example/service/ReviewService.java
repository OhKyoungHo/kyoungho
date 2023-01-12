package com.example.service;

import java.util.List;

import com.example.domain.ReviewVO;

public interface ReviewService {
   
   
    public void saveRV (ReviewVO vo);
    

    public  List<Object[]> avgStar();
    

    //Page<ReviewVO> a(Pageable paging, String temp_ed_id);

    
    public  List<Object[]> avgStarvc();
}