package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.CalendarVO;
import com.example.persistence.CalendarRepository;


@Controller
@RequestMapping("/lecture")
public class CalendarController {
	
	//서비스, 서비스임플 단을 통하지않고 바로 레포지토리 단을 통하여 코드실행
	@Autowired
	private CalendarRepository calRepo;
	
	
	//DB에 입력된 강사 스케쥴을 달력에 구현하는 과정
	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	//ModelAndView를 이용하여 구현
	public ModelAndView getCalendarList(HttpServletRequest request,Integer tId) {
//		System.out.println("/academy/calendar");
		String viewpage = "/lecture/calendar";
		List<CalendarVO> calendar = null;
		try {
			calendar = calRepo.CalendarSearch(tId);
			request.setAttribute("calendarList", calendar);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName(viewpage);
		return mv;
	}
	
	//스윗알럿에 뜬 예약확인창에 예약버튼을 눌를경우 실행
	@RequestMapping("/reservation")
	public String reservation(Integer calId) {
		calRepo.reservation(calId);
		// 추후에 마이페이지로 리턴값수정해야함
		return "redirect:/lecture/tutor";
	}
	
	

}
