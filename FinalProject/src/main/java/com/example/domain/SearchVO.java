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

@Entity
@Data
@Table(name="search")

public class SearchVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="s_id")
	private Integer s_id;

	private String keywords;

	private Date s_time;

	//JPA에서 DB로 자동으로 DATE에 오늘 날짜 쓰기!
	@PrePersist
	public void beforeCreate() {
		s_time = new Date();
	}

}
