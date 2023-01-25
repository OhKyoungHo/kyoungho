package com.example.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.CalendarVO;
import com.example.domain.EducationVO;
import com.example.domain.ReviewVO;
import com.example.domain.TeacherVO;
import com.example.persistence.CalendarRepository;
import com.example.persistence.JjimRepository;
import com.example.persistence.ReviewRepository;
import com.example.persistence.WishListRepository;
import com.example.service.EducationService;
import com.example.service.TeacherService;
import com.example.service.WishListService;


@Controller
@RequestMapping("/mypage")
public class MypageController {



	@Autowired
	private TeacherService teacherService;

	@Autowired
	private ReviewRepository reviewRepository;
	
	@Autowired
	private EducationService educationService;

	@Autowired
	private WishListRepository wishRepo;

	@Autowired
	private WishListService wishService;
	
	@Autowired
	private JjimRepository jjimRepo;
	
	@Autowired
	private CalendarRepository calRepo;




	//선생님 등록전 그냥 화면용
	@GetMapping("/tutorInsert")
	public String tutorPageView() {

		return  "/mypage/tutorInsert";

	}

	//국비/부트 등록전 그냥 화면용
	@GetMapping("/educationInsert")
	public String educationView() {

		return  "/mypage/educationInsert";

	}




	//마이페이지 / 국비/부트 학원 등록용
	@PostMapping("/tutorInsert")
	public String insertTeacher(TeacherVO tvo) {
		System.out.println("tutorInsert 확인" + tvo); 

		teacherService.insertTeacher(tvo);


		return "redirect:/mypage/tutorInsert";   
	}


	
	

	//국비/부트 등록용
	@PostMapping("/educationInsert")
	public String insertEducation(EducationVO evo) {
		System.out.println("insertEducation 확인" + evo); 

		
		educationService.insertEducation(evo);


		return "redirect:/mypage/educationInsert";   
	}






	/*
		  //화면용
		  @GetMapping("/myreview")
		  public String myreviewPageView() {

			  return  "/mypage/myreview";

		  }
	 */


	//마이페이지 국비/부트 부분에서의 리뷰만!
	@GetMapping("/myreview")
	public String getEdReview(ReviewVO rvo, Model model,HttpSession session,
			@RequestParam(required = false, defaultValue = "") String memIdInt,
			@PageableDefault(size = 2, direction = Sort.Direction.DESC) Pageable paging) {


		//세션에 저장된 값으로 넘겨버리기 
		rvo.setMemIdInt((Integer) session.getAttribute("memIdInt"));
		String temp_m_idint = String.valueOf(rvo.getMemIdInt());
		System.out.println(temp_m_idint);
		Page<ReviewVO> mypageReviewList1 = reviewRepository.getMyReview1(paging, temp_m_idint);

		//현재페이지
		int pageNumber=((Slice<ReviewVO>) mypageReviewList1).getPageable().getPageNumber();
		//총페이지수
		int totalPages=((Page<ReviewVO>) mypageReviewList1).getTotalPages(); //검색에따라 10개면 10개..
		int pageBlock = 5; //블럭의 수 1, 2, 3, 4, 5   
		//시작하는 블록
		int startBlockPage = ((pageNumber)/pageBlock)*pageBlock+1; //현재 페이지가 7이라면 1*5+1=6
		//끝나는 블록
		int endBlockPage = startBlockPage+pageBlock-1; //6+5-1=10. 6,7,8,9,10해서 10.
		endBlockPage= totalPages<endBlockPage? totalPages:endBlockPage;

		System.out.println("reviewList : " + mypageReviewList1.getContent());

		//각 값들을 jsp 파일에 붙이기
		model.addAttribute("pageNumber", pageNumber);
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("endBlockPage", endBlockPage);
		model.addAttribute("startBlockPage", startBlockPage);
		model.addAttribute("mypageReviewList1", mypageReviewList1.getContent()); 


		return "mypage/myreview";
	}


	
	//마이페이지 화상학원부분
	@GetMapping("/myreview2")
	public String getEdReview2(ReviewVO rvo, Model model,HttpSession session,
			@RequestParam(required = false, defaultValue = "") String memIdInt,
			@PageableDefault(size = 2, direction = Sort.Direction.DESC) Pageable paging) {


		//세션에 저장된 값으로 넘겨버리기 
		rvo.setMemIdInt((Integer) session.getAttribute("memIdInt"));
		String temp_m_idint = String.valueOf(rvo.getMemIdInt());
		System.out.println(temp_m_idint);
		Page<ReviewVO> mypageReviewList2 = reviewRepository.getMyReview2(paging, temp_m_idint);

		//현재페이지
		int pageNumber=((Slice<ReviewVO>) mypageReviewList2).getPageable().getPageNumber();
		//총페이지수
		int totalPages=((Page<ReviewVO>) mypageReviewList2).getTotalPages(); //검색에따라 10개면 10개..
		int pageBlock = 5; //블럭의 수 1, 2, 3, 4, 5   
		//시작하는 블록
		int startBlockPage = ((pageNumber)/pageBlock)*pageBlock+1; //현재 페이지가 7이라면 1*5+1=6
		//끝나는 블록
		int endBlockPage = startBlockPage+pageBlock-1; //6+5-1=10. 6,7,8,9,10해서 10.
		endBlockPage= totalPages<endBlockPage? totalPages:endBlockPage;

		System.out.println("reviewList : " + mypageReviewList2.getContent());

		//각 값들을 jsp 파일에 붙이기
		model.addAttribute("pageNumber", pageNumber);
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("startBlockPage", startBlockPage);
		model.addAttribute("endBlockPage", endBlockPage);
		model.addAttribute("mypageReviewList1", mypageReviewList2.getContent()); 


		return "mypage/myreview2";
	}
	
	
	
	// 경호의 메소드
	
	//위시리스트 교육과정용
	@RequestMapping("/wishlist")
	public void wishList(Model m, Integer memIdInt) {
		List<Object[]> list = wishRepo.findByMemIdInt(memIdInt);
		System.out.println(list);
		m.addAttribute("wishList", list);
	}

	//위시리스트 강의용
	@RequestMapping("/jjimlist")
	public void jjimList(Model m, Integer memIdInt) {
		List<Object[]> list = jjimRepo.findByMemIdIntlec(memIdInt);
		System.out.println(list);
		m.addAttribute("jjimList", list);
	}

	//위시리스트 삭제
	@RequestMapping("/deleteWish")
	public String deletewish(Integer memIdInt, Integer wId) {
		wishService.deleteWish(memIdInt, wId);
		return "redirect:/mypage/wishlist?memIdInt="+ memIdInt;
	}

	//위시리스트 등록
	@RequestMapping("/wishInsert")
	public String wishInsert(Integer memIdInt, Integer edId ) {
		wishService.insertWish(memIdInt, edId);
		return "redirect:/academy/course-details?edId="+ edId;
	}

	//찜리스트 등록
	@RequestMapping("/jjimInsert")
	public String jjimInsert(Integer memIdInt, Integer vcId ) {
		wishService.insertJjim(memIdInt, vcId);
		return "redirect:/lecture/lecture-details?vcId="+ vcId;
	}

	//찜리스트 삭제
	@RequestMapping("/deleteJjim")
	public String jjimDelete(Integer memIdInt, Integer jjId ) {
		wishService.deleteJjim(memIdInt, jjId);
		return "redirect:/mypage/jjimlist?memIdInt="+ memIdInt;
	}


	// mypage에 있는 회원의 예약 달력과 예약한 방 출력
	@RequestMapping(value = "/lessonreserve", method = RequestMethod.GET)
	//ModelAndView를 이용하여 구현
	public ModelAndView getMemberCalendarList(HttpServletRequest request, HttpSession session) {
		
		Integer memIdInt = (Integer) session.getAttribute("memIdInt");
		
		String viewpage = "/mypage/lessonreserve";
		List<Map<String, Object>> calendarTemp = null;
		try {
			calendarTemp = calRepo.MemberCalendarSearch(memIdInt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 새로운 리스트를 준비
		List<HashMap<String, Object>> calendar = new ArrayList<HashMap<String, Object>>();
		
		// 새로운 HashMap을 생성하고 차례대로 값을 집어넣기
		for(Map<String, Object> m : calendarTemp) {
			System.out.println("calid : " + m.get("calid"));
			
			HashMap<String, Object> HashTemp = new HashMap<String, Object> ();
			HashTemp.put("calid", m.get("calid"));
			HashTemp.put("caltitle", m.get("caltitle"));
			HashTemp.put("calstart", m.get("calstart"));
			HashTemp.put("calreserve", m.get("calreserve"));
			HashTemp.put("calend", m.get("calend"));
			HashTemp.put("memidint", m.get("memidint"));
			HashTemp.put("roomid", m.get("roomid"));
			HashTemp.put("tid", m.get("tid"));
			HashTemp.put("vctitle", m.get("vctitle"));
			HashTemp.put("tcpic", m.get("tcpic"));
			HashTemp.put("tcname", m.get("tcname"));
			
			//원하는 데이터 포맷 지정
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 a h:mm"); 
			String dateTemp = simpleDateFormat.format(m.get("calstart"));
			System.out.println("date format : " + dateTemp);
			// 새로운 형식의 날짜를 HashMap에 추가
			HashTemp.put("calstartSTR", dateTemp);
			
			calendar.add(HashTemp);
		}
		
		request.setAttribute("calendarList", calendar);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName(viewpage);
		return mv;
	}
	
	

}
