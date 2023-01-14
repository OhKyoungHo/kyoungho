package com.example.service;

import java.util.List;

import com.example.domain.EducationVO;

public interface EducationService {
   List<EducationVO> getBoardList(EducationVO vo);
//   void saveBoard(EducationVO vo);
   EducationVO getBoard(EducationVO vo);

//   void updateBoard(EducationVO vo);
   
   //경호
   /*** 관리자 페이지 ***/
   //상품전체 조회
   List<EducationVO> selectAllAcademy();
   
   
   //경호
   //교육과정 삭제
   void deleteAcademy(EducationVO vo);
   

}