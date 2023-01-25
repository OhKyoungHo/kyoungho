package com.example.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.CalendarVO;

public interface CalendarRepository extends CrudRepository<CalendarVO, Integer> {

	
	
	// 달력에 입력된 db값을 List화
	// cal_reserve(예약시 1, 예약 아닐시 0)을 0인것을 띄움
	@Query(value="SELECT c.cal_id, c.cal_title, c.cal_start, c.cal_reserve,c. cal_end, c.t_id\r\n"
			+ "FROM calendar c inner join vchat_teacher t\r\n"
			+ "ON c.t_id = t.t_id\r\n"
			+ "WHERE c.t_id =?1 AND c.cal_reserve=0", nativeQuery=true)
	List<CalendarVO> CalendarSearch(Integer tId);
	
	// 예약누를시 cal_reserve를 1(예약상태)로 변경
	@Query(value="UPDATE calendar SET cal_reserve = 1 WHERE cal_id = ?1", nativeQuery = true)
	Integer reservation(Integer calId);
	
	
	// 회원 달력 list
	@Query(value="SELECT c.cal_id calid, c.cal_title caltitle, c.cal_start calstart, c.cal_reserve calreserve, "
			+ "c. cal_end calend, c.m_idint memidint, c.room_id roomid, c.t_id tid, v.vc_title vctitle, t.t_pic tcpic, t.t_name tcname\r\n"
			+ "FROM calendar c left outer join vchat_class v ON c.vc_id = v.vc_id\r\n"
			+ "left outer join vchat_teacher t ON c.t_id = t.t_id\r\n"
			+ "WHERE c.m_idint =?1", nativeQuery=true)
	List<Map<String, Object>> MemberCalendarSearch(Integer memIdInt);
	
}
