package com.example.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="news")
//롬복을 통해 getter,setter이용, DB의 news테이블 이용
public class NewsVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//PK키인 newsId에 @ID주기
	private Integer newsId;
	
	private String newsTitle;
	private String newsShort;
	private Date newsDate;
	private String newsContent;
	private String newsImg;
	private String newsMan;
	
}
