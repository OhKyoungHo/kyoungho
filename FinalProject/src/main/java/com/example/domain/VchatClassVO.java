package com.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="vchat_class")
public class VchatClassVO {						//학원 수업 상세페이지

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vc_id")
	private Integer vcId;							//화상 수업 번호		//코딩 게시판 답변번호
	
	@Column(name="t_id")
	private Integer teacherId;						//선생님 번호
	
	private String vc_title;						//화상수업제목					
	
	private String vc_intro;						//화상수업소개글
	
	private String vc_content;						//화상수업 내용
	
	private String vc_keyword;						//카테고리 키워드
	
	private String vc_pic;							//화상 수업 사진
	
	private Integer avg;							// 평균
	
	private Date vc_days;							// 
	
}
