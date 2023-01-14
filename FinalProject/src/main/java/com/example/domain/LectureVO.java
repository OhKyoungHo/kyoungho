package com.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="vchat_class")
public class LectureVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="vc_id", nullable=false)
	private Integer vcId;
	
	@Column(name="t_id", nullable=false)
	private Integer tcId;
	
	@Column(name="vc_title", nullable=false)
	private String vcTitle;
	private String vc_intro;
	private String vc_content;
	@Column(name="vc_keyword", nullable=false)
	private String vcKeyword;
	private String vc_pic;

	@Column(name="vc_days", nullable=false)
	private Date vcDays; //찬주 변경 교육등록날짜

	//각 교육별 평균 점이 달라야 하기에 추가
	private Integer avg;



}
