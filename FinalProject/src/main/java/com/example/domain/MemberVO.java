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
@Table(name="member")
public class MemberVO {
   
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="m_idint")
   private Integer memIdInt;
   
   @Column(name="m_idstring", unique=true)
   private String memIdString;
   
   @Column(name="m_pass")
   private String memPass;
   
   @Column(name="m_name")
   private String memName;
   
   @Column(name="m_nickname")
   private String memNickname;
   
   @Column(name="m_tel")
   private String memTel;
   
   private String m_post;
   private String m_addr;
   private String m_addr_sub;
   
   @Column(nullable=false, name="m_email")
   private String memEmail;
   
   private String m_profile;
   private String m_delete;
   
   private Date p_end_date;
   private Integer p_daysperweek;
   private Integer p_minute;
   private Integer p_days_left;
   
   @Column(name="t_id")
   private Integer t_id;
   
   @PrePersist
	public void beforeCreate() {
	   p_end_date = new Date();
	}
   
}