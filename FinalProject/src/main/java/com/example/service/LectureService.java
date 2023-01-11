package com.example.service;

import java.util.List;

import com.example.domain.LectureVO;

public interface LectureService {
	List<LectureVO> getBoardList(LectureVO vo);
	//   void saveBoard(EducationVO vo);
	LectureVO getBoard(LectureVO vo);
	//   void deleteBoard(EducationVO vo);
	//   void updateBoard(EducationVO vo);

}
