package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="jjim")
public class JjimVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="jj_id", nullable=true)
	private Integer jjId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="m_idint")
	private MemberVO memIdInt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="vc_id")
	private LectureVO vcId;
	


}
