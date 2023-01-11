package com.example.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.EducationVO;
import com.example.domain.MemberVO;
import com.example.domain.WishListVO;

public interface WishListRepository extends CrudRepository<WishListVO, Integer>{

	@Query(value="SELECT e.ed_pic AS pic, e.ed_title AS title, e.ed_price, e.ed_start_date, e.ed_end_date, e.ed_id, w.w_id, w.m_idint\r\n"
			+ "FROM education e inner join wishlist w\r\n"
			+ "ON e.ed_id = w.ed_id\r\n"
			+ "WHERE w.m_idint=?"
			+ "ORDER BY w.w_id DESC", nativeQuery=true)
	List<WishListVO> getWishList(WishListVO vo);

	//Optional<WishListVO> findByMemId(MemberVO memId);
	
	
	@Query(value="INSERT INTO wishlist (w_id, m_idint, ed_id) VALUES(nextval(w_id_seq), ?1, ?2)", nativeQuery=true)
	void insertWish(Integer memIdInt, Integer edId);
	
	@Query(value="DELETE FROM wishlist WHERE m_idint=?1 AND e_id=?2", nativeQuery=true)
	void deleteWish(Integer memIdInt, Integer edId);

	@Query(value="SELECT * FROM wishlist WHERE m_idint =?1 AND ed_id =?2", nativeQuery=true)
	WishListVO getWish(Integer memIdInt, Integer edId);
	
	
//	void  deleteByEdIdAndMemId(Integer edId, String memId);
//		
	
}
