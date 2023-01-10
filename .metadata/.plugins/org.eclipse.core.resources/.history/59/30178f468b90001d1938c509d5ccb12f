package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="wishlist")
public class WishListVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="w_id", nullable=false)
	private Integer wId;
	
	@ManyToOne
	@JoinColumn(name="m_id")
	private MemberVO mId;
	
	@ManyToOne
	@JoinColumn(name="ed_id")
	private EducationVO edId;

}
