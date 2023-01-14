package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.AnnouncementVO;
import com.example.domain.EducationVO;
import com.example.domain.LectureVO;
import com.example.domain.MemberVO;
import com.example.domain.ReviewVO;
import com.example.service.AnnouncementService;
import com.example.service.EducationService;
import com.example.service.LectureService;
import com.example.service.MemberService;
import com.example.service.ReviewService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private EducationService eduService;
	
	@Autowired
	private MemberService memService;
	
	@Autowired
	private AnnouncementService announcementService;
	
	@Autowired
	private ReviewService reviewService;
	
	@Autowired
	private LectureService lectureService;
	
	//경호
	//학원등록 페이지로 이동
	@RequestMapping("/academyRegister")
	public String academyRegister(EducationVO vo, Model m) {
		System.out.println("academy Register : " + vo);
		//교육과정에 대한 전체값 가져오기
		EducationVO result = eduService.getBoard(vo);
		System.out.println("result : " + result);
		//jsp 파일에 붙이기
		m.addAttribute("education", result);
		return "admin/academyRegister";
	}
	//경호
	//학원목록 페이지로 이동
	@RequestMapping("/academyList")
	public String academyList(Model m) {	
		List<EducationVO> list = eduService.selectAllAcademy();
		m.addAttribute("result", list);
		return "admin/academyList";
	}
	
	//경주
	//관리자에 공지 목록띄움
	@RequestMapping("/announcement_m")
	public String annoList(Model m) {	
		List<AnnouncementVO> list = announcementService.selectAllAnnouncement();
		m.addAttribute("result", list);
		return "admin/announcement_m";
	}
	
	//경주
	//공지상세 페이지띄우기
	@RequestMapping("/announcementModify")
	public void getAnnouncement(AnnouncementVO vo, Model m) {
		m.addAttribute("anno", announcementService.getAnnouncement(vo));
		
	}
	
	//경주 
	//공지 등록하기
	@RequestMapping("/announcementInsertReal")
	public String announcementInsert(AnnouncementVO vo) {
		System.out.println("1");
		System.out.println("AD ID: " + vo.getAdId());
		announcementService.announcementInsert(vo);
		System.out.println("2");
		return "redirect:announcement_m";
	}	

	//경주
	//공지내용 삭제하기
	@RequestMapping("/announcementDelete")
	public String deleteAnnouncement(AnnouncementVO vo) {
		announcementService.announcementDelete(vo);
		return "redirect:announcement_m";
	}
	
	//경주
	//공지내용 수정하기
	@RequestMapping("announcementUpdate")
	public String updateAnnouncement(AnnouncementVO vo) {
		announcementService.announcementUpdate(vo);
		return "redirect:announcement_m";
	}
	
	//경호
	//회원목록 나오게 하기
	@RequestMapping("/memberlist")
	public String memberList(Model m) {
		List<MemberVO> list = memService.memberList();	
		m.addAttribute("memberList", list );
		return "admin/memberlist";
	}
	
	//경호
	//멤버 상세정보 보기
	@RequestMapping("/memberDetail")
	public String memberDetail(Model m, MemberVO vo) {
		MemberVO result = memService.findByMemIdString(vo);
		System.out.println(result);
		m.addAttribute("memberList", result);
		return "admin/memberDetail";
	}

	//경호
	//리뷰리스트 출력
	@RequestMapping("/reviewList")
	public String reviewList(Model m) {
		List<ReviewVO> list = reviewService.reviewList();
		m.addAttribute("reviewList", list);
		return "admin/reviewList";
	}
	
	//경호
	//학원교육과정 삭제하기
	@RequestMapping("/deleteAcademy")
	public String deleteAcademy(EducationVO vo) {
		eduService.deleteAcademy(vo);
		return "redirect:academyList";
	}
	
	//경호
	//강의리스트 출력
	@RequestMapping("/lecturelist")
	public String lectureList(Model m) {
		List<LectureVO> list = lectureService.lectureList();
		m.addAttribute("lectureList", list);
		return "admin/lecturelist";
	}
}
