package com.example.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="admin")
public class AdminVO {										//관리자 회원가입
	
	@Id
	@Column(name="ad_id")
	private String adId;									// 관리자 아이디
	
	@Column(name="ad_pass")
	private String adPass;									// 관리자 비밀번호
	
	@Column(name="ad_tel")
	private String adTel;									// 공지 내용

	@Column(name="ad_email")
	private String adEmail;									// 이메일
	
	
}
