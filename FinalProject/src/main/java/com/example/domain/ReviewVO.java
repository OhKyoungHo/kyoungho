package com.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
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
   
   @Column(name="m_idint")
   private Integer memIdInt;
   
   @Column(name="m_idstring")
   private String memIdString;
   
   @Column(name="re_date")
   private Date reDate; 
   
   
   private Integer star; //별점
   
   @Column(name="re_content")
   private String reContent; //리뷰작성글
   
   private Integer vc_id;
   
   @Column(name="ed_id", nullable=false)
   private Integer edId;
   
   @PrePersist
	public void beforeCreate() {
	   reDate = new Date();
	}
   

}