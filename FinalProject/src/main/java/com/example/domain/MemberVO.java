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
	private String m_id;
	@Column(nullable=false)
	private String m_pass;
	private String m_tel;
	private String m_post;
	private String m_addr;
	private String m_addr_sub;
	private String m_email;
	
	private LocalDateTime p_end_date;
	private Integer p_daysperweek;
	private Integer p_minute;
	private Integer p_days_left;
	
	@OneToOne
	@JoinColumn(name="t_id")
	private VchatTeacherVO t_id;
	
	// @ColumnDefault("0")
	
}
