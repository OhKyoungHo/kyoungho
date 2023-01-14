package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.EducationVO;
import com.example.persistence.EducationRepository;

@Service
public class EducationServiceImpl implements EducationService {
   
   @Autowired
   private EducationRepository eduRepo;

   @Override
   public List<EducationVO> getBoardList(EducationVO vo) {
      List<EducationVO> list = (List<EducationVO>) eduRepo.findAll();
      System.out.println(list);
      return list;
   }

   @Override
   public EducationVO getBoard(EducationVO vo) {
      return eduRepo.findById(vo.getEdId()).get();
   }
   
   //경호
   //관리자페이지
   //교육과정 전체 조회
   public List<EducationVO> selectAllAcademy() {
      return (List<EducationVO>) eduRepo.findAll();
   }
   
   //경호
   //관리자페이지
   //교육과정 삭제
   public void deleteAcademy(EducationVO vo) {
    eduRepo.deleteById(vo.getEdId());
   };
}