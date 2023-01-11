package com.example.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="honest_question")
public class HonestQuestionVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="hq_id")
	private Integer hqId;
	
	private String hq_q;
	private String hq_title;
	private String hq_keyword;
	private String hq_category;
	private Date hq_date;
	private Integer hq_cnt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="m_idint")
	private MemberVO memIdInt;
	
	@PrePersist
	public void beforeCreate() {
		hq_date = new Date();
		hq_cnt = 0;
	}

}
