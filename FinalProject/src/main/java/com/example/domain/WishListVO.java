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
@Table(name="wishlist")
public class WishListVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="w_id", nullable=true)
	private Integer wId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="m_idint")
	private MemberVO memIdInt;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ed_id")
	private EducationVO edId;


	
//
//	public static WishListVO toWishListVO(MemberVO memId, EducationVO edId){
//		WishListVO wishListVO = new WishListVO();
//		wishListVO.setMemId(memId);
//		wishListVO.setEdId(edId);
//
//		return wishListVO;
//	}

}
