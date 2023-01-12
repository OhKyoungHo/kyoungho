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
@Table(name="vchat_teacher")
public class TeacherVO {
	
	//모두 컬럼 변경해놓음 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="t_id", nullable=false)
	private Integer teacherId;
	
	
	@Column(name="t_pic", nullable=false)
	private String tcPic;
	
	
	@Column(name="t_name", nullable=false)
	private String tcName;
	
	
	@Column(name="t_intro", nullable=false)
	private String tcIntro;
	
	
	@Column(name="t_spec", nullable=false)
	private String tcSpec;
	
	
	@Column(name="t_keyword", nullable=false)
	private String tcKeyword;

}
