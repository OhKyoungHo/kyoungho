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
   
   private Date ed_enlist_date;
   private Date ed_start_date;
   private Date ed_end_date;
   private String ed_addr;
   private Integer ed_price;
   private String ed_intro;
   private String ed_keyword;
   private String ed_time;
   private String ed_comm;
   private String ed_curriculum;
   private Boolean ed_tf;
   private String ed_pic;
   
   @Column(name="ed_days", nullable=false)
   private Date edDays; //찬주 변경 학원등록날짜
}