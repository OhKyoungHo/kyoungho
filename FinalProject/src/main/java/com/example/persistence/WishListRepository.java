package com.example.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.WishListVO;

public interface WishListRepository extends CrudRepository<WishListVO, Integer>{

	@Query(value="SELECT e.ed_name AS NAME , e.ed_pic AS pic, e.ed_title AS title, e.ed_price, e.ed_start_date, e.ed_end_date, e.ed_id, w.w_id, w.m_id\r\n"
			+ "FROM education e inner join wishlist w\r\n"
			+ "ON e.ed_id = w.ed_id\r\n"
			+ "ORDER BY w.w_id DESC", nativeQuery=true)
	 List<Object[]> getWishList();
	
}
