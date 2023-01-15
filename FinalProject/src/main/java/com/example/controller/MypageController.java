package com.example.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.ReviewVO;
import com.example.domain.TeacherVO;
import com.example.persistence.ReviewRepository;
import com.example.persistence.TeacherRepository;
import com.example.service.TeacherService;


@Controller
@RequestMapping("/mypage")
public class MypageController {

	
	
	  @Autowired
	   private TeacherService teacherService;
	  
	  
	  @Autowired
	   private TeacherRepository teacherRepository;
	  
	  @Autowired
	   private ReviewRepository reviewRepository;


	   
	

	  
	  //등록하기전에 그냥 화면보이기용 등록함수와 이함수를 2개를 둬야함 
	  @GetMapping("/tutorInsert")
	  public String tutorPageView() {
		  return  "/mypage/tutorInsert";
		  
	  }
	  
	   
	  
	  //선생님 등록용
	   @PostMapping("/tutorInsert")
		public String insertTeacher(TeacherVO tvo) {
		System.out.println("인설트 티처 확인" + tvo); 
		   
		teacherService.insertTeacher(tvo);
		
		   
			return "redirect:/mypage/tutorInsert";   
		}

	   


	   

	   /*
		  //화면용
		  @GetMapping("/myreview")
		  public String myreviewPageView() {
			  
			  return  "/mypage/myreview";
			  
		  }
	  */
	   
	   
	   //마이페이지 작성글관리에서 학원에 단 리뷰번호만!
	   @GetMapping("/myreview")
	   public String getEdReview(ReviewVO rvo, Model model,
			   @RequestParam(required = false, defaultValue = "") String memIdInt,
			   @PageableDefault(size = 2, direction = Sort.Direction.DESC) Pageable paging) {
		   
		   //임의로 값 넘김 
		   rvo.setMemIdInt(1339);
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
		      model.addAttribute("mypageReviewList1", mypageReviewList1.getContent()); 

		      
		   return "mypage/myreview";
	   }
	   
	   
	
}
