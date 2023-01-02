package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="vchat_teacher")
public class VchatTeacherVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer t_id;								// 선생님 아이디
	
	private String t_pic;								// 선생님 사진
	private String t_name;								// 선생님 이름
	private String t_intro;								// 선생님 소개글
	private String t_spec;								// 선생님 경력

}
