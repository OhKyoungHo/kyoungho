package com.example.service;

import java.util.List;

import com.example.domain.EducationVO;

public interface EducationService {
	//교육과정 전체리스트 출력
	List<EducationVO> getBoardList(EducationVO vo);
//	void saveBoard(EducationVO vo);
	//교육과정 상세정보 출력
	EducationVO getBoard(EducationVO vo);
//	void deleteBoard(EducationVO vo);
//	void updateBoard(EducationVO vo);

}