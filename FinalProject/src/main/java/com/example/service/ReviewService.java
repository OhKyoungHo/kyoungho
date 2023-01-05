package com.example.service;


import java.util.List;

import com.example.domain.ReviewVO;

public interface ReviewService {
   
   
    public void saveRV (ReviewVO vo);
    
    public List<ReviewVO> getRV(ReviewVO vo);   
    
    public Integer avgStar();
    

}