package com.example.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="review")
public class ReviewVO {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="re_id")
   private Integer RId;
   
   @Column(name="m_id")
   private String MId;
   
   
   @Column(name="re_date")
   private LocalDateTime reDate; 
   
   
   private Integer star; //별점
   
   @Column(name="re_content")
   private String reContent; //리뷰작성글
   
   private Integer vc_id;
   
   @Column(name="ed_id", nullable=false)
   private Integer edId;
   
   
   

}