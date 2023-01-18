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
@Table(name="education")
public class EducationVO {
   
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="ed_id", nullable=false)
   private Integer edId;
   
   //찬주변경 교육과정제목
   @Column(name="ed_title", nullable=false)
   private String edTitle;
   //찬주변경 학원이름
   @Column(name="ed_name", nullable=false)
   private String edName;
   
   @Column(name="ed_enlist_date", nullable=false)
   private String edEnlistDate;
   
   @Column(name="ed_start_date", nullable=false)
   private String edStartDate;
   
   @Column(name="ed_end_date", nullable=false)
   private String edEndDate;
   
   @Column(name="ed_addr", nullable=false)
   private String edAddr;
   
   @Column(name="ed_price", nullable=false)
   private String edPrice; //수강비
   
   @Column(name="ed_intro", nullable=false)
   private String edIntro;
   
   //0108 일요일 찬주추가
   
   @Column(name="ed_keyword", nullable=false)
   private String edKeyword;
   
   @Column(name="ed_time", nullable=false)
   private String edTime;
   
   @Column(name="ed_comm", nullable=false)
   private String edComm;
   
   @Column(name="ed_curriculum", nullable=false)
   private String edCurriculum;
   
   @Column(name="ed_tf")
   private Boolean edTf;
   
   @Column(name="ed_pic", nullable=false)
   private String edPic;
   
   @Column(name="ed_days", nullable=false)
   private String edDays; //찬주 변경 학원등록날짜
   
   //각 교육별 평균 점이 달라야 하기에 추가
   private Integer avg;
}