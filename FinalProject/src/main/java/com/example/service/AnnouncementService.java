package com.example.service;

import java.util.List;

import com.example.domain.AnnouncementVO;

public interface AnnouncementService  {

	List<AnnouncementVO> getAnnouncementList(AnnouncementVO vo);
	
	AnnouncementVO getAnnouncement(AnnouncementVO vo);
	
	List<AnnouncementVO> selectAllAnnouncement();
}
