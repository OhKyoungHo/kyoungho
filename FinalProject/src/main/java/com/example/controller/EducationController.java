package com.example.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.domain.EducationVO;
import com.example.persistence.EducationRepository;
import com.example.service.EducationService;

@Controller
@RequestMapping("/academy")
public class EducationController {
	
	@Autowired
	private EducationService eduService;
	
	@Autowired
	private EducationRepository eduRepo;
	
//	@RequestMapping("/course-sidebar")
//	public void getBoardList(Model m) {
//		EducationVO vo = new EducationVO();
//		List<EducationVO> list = eduService.getBoardList(vo);
//		//System.out.println(list);
//		System.out.println("[Controller:getBoardList 요청] 결과갯수 : " + list.size());
//		
//		m.addAttribute("academyList", list);
//	}

	//경호
	@RequestMapping("/course-sidebar2")
	//한페이지에 들어가는 수는 6개, 정렬을 edId로 하는 것으로 설정
	public String getAcademyList(Model m, @PageableDefault(size = 6, sort = "edId", direction = Sort.Direction.DESC) 
	Pageable paging) {
		//Education 테이블을 페이징한 것을 변수 elist로 설정
		Page<EducationVO> elist = eduRepo.findAll(paging);
		//System.out.println(elist);
		//현재페이지
		int pageNumber=elist.getPageable().getPageNumber();
		//총페이지수
		int totalPages=elist.getTotalPages(); //검색에따라 10개면 10개..
		int pageBlock = 5; //블럭의 수 1, 2, 3, 4, 5	
		//시작하는 블록
		int startBlockPage = ((pageNumber)/pageBlock)*pageBlock+1; //현재 페이지가 7이라면 1*5+1=6
		//끝나는 블록
		int endBlockPage = startBlockPage+pageBlock-1; //6+5-1=10. 6,7,8,9,10해서 10.
		endBlockPage= totalPages<endBlockPage? totalPages:endBlockPage;
		
		//각 값들을 jsp 파일에 붙이기
		m.addAttribute("pageNumber", pageNumber);
		m.addAttribute("totalPages", totalPages);
		m.addAttribute("startBlockPage", startBlockPage);
		m.addAttribute("endBlockPage", endBlockPage);
		m.addAttribute("academyList", elist.getContent());
		return "academy/course-sidebar2";
	}
	
	@RequestMapping("/course-details")
	public void getBoard(EducationVO vo, Model model) {
		model.addAttribute("education", eduService.getBoard(vo)); // Model 정보 저장			
	}

}
