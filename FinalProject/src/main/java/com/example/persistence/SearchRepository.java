package com.example.persistence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.example.domain.SearchVO;

public interface SearchRepository extends CrudRepository<SearchVO, Integer>{

	//위시리스트 입력
	@Query(value="INSERT INTO search (keywords) VALUES(?1)", nativeQuery=true)
	void insertSearch(String keywords);



}
