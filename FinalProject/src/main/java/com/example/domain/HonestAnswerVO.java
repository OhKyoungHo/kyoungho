package com.example.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="honest_answer")
public class HonestAnswerVO {
	
	@Id
	@Column(name="ha_id")
	private Integer haId;
	
	private String ha_a;
	@Column(name="ha_date")
	private Date haDate;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="m_idint")
	private MemberVO memIdInt;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="hq_id")
	private HonestQuestionVO hqId;
	
	@PrePersist
	public void beforeCreate() {
		haDate = new Date();
	}
	
}
