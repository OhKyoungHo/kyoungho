package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.AnnouncementVO;
import com.example.service.AnnouncementService;

@Controller
@RequestMapping("/academy")
public class AnnouncementController {

	@Autowired
	private AnnouncementService announcementService;
	
	@RequestMapping("/announcement")
	public void getAnnouncementList(Model m) {
		AnnouncementVO vo = new AnnouncementVO();
		List<AnnouncementVO> list = announcementService.getAnnouncementList(vo);
		m.addAttribute("announcementList",list);
	}
	
	@RequestMapping("/announcement-detail")
	public void getAnnouncement(AnnouncementVO vo, Model m) {
		m.addAttribute("announcement", announcementService.getAnnouncement(vo));
	}
}	
