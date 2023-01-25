package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="vchat_file")
public class VchatFileVO {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vcFileId;
	
	private Integer calId;
	
	private String origFileName;
	private String FileName;
	private String FilePath;

}
