package com.example.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="member")
public class MemberVO {
	
	 
	@Id
	@Column(name="m_id")
	private String memId;
	@Column(nullable=false, name="m_pass")
	private String memPass;
	@Column(nullable=false, name="m_name")
	private String memName;
	@Column(nullable=false, name="m_tel")
	private String memTel;
	private String m_post;
	private String m_addr;
	private String m_addr_sub;
	@Column(nullable=false, name="m_email")
	private String memEmail;
	
	private LocalDateTime p_end_date;
	private Integer p_daysperweek;
	private Integer p_minute;
	private Integer p_days_left;
	
	@OneToOne
	@JoinColumn(name="t_id")
	private VchatTeacherVO t_id;
	
}
