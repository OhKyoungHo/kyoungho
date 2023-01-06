package com.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Announcement")
public class AnnouncementVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer anId;
	
	private String anTitle;
	private String anContent;
	
	private Date anDate;
	private String adId;
	
	
	//JPA에서 DB로 자동으로 DATE에 오늘날짜 쓰기!
	@PrePersist
	public void beforeCreate() {
		anDate = new Date();
	}
	
	
}
