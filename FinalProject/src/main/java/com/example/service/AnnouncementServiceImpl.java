package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.AnnouncementVO;
import com.example.persistence.AnnouncementRepository;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {
	
	@Autowired
	private AnnouncementRepository AnnoRepo;
	
	@Override
	public List<AnnouncementVO> getAnnouncementList(AnnouncementVO vo){
		List<AnnouncementVO> list = (List<AnnouncementVO>) AnnoRepo.findAll();
		return list;
	}
	@Override
	public AnnouncementVO getAnnouncement(AnnouncementVO vo) {
		return AnnoRepo.findById(vo.getAnId()).get();
	}
	
	public List<AnnouncementVO> selectAllAnnouncement(){
		return (List<AnnouncementVO>) AnnoRepo.findAll();
	}

}
