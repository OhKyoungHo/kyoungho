package com.example.persistence;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.TeacherVO;

public interface TeacherRepository extends CrudRepository<TeacherVO, Integer>{
	
	
	
	
	//선생님 리스트 페이징
	 @Query(value=" SELECT *  "
	            + " FROM vchat_teacher "
	            + " WHERE lower(t_name) LIKE CONCAT('%',?1,'%') "
	            + " OR lower(t_keyword) LIKE CONCAT('%',?1,'%') ",
	            countQuery="SELECT count(*)  "
	                   + " FROM vchat_teacher "
	                   + " WHERE lower(t_name) LIKE CONCAT('%',?1,'%') "
	                   + " OR lower(t_keyword) LIKE CONCAT('%',?1,'%') ",
	                   nativeQuery=true)
    Page<TeacherVO> AllTeacherAndPagingAndSearch(Pageable paging, 
            String keywords);

	 
	 
	
}
