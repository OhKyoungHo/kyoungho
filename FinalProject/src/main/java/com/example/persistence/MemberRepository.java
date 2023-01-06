package com.example.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.MemberVO;


public interface MemberRepository extends JpaRepository<MemberVO, Integer> {
	
	// 로그인
	List<MemberVO> findByMemIdAndMemPass(String memId, String memPass);
	
	// 아이디 중복 체크
	Integer countByMemId(String memId);
	
	// 이름과 전화번호로 아이디 찾기	
	MemberVO findByMemTelAndMemName(String memTel, String memName);
		
	// 임시 비밀번호 발송 //트렌젝션을 주지 않으면 컨트롤러의 ->mailResult 가 null 값으로 들어감
	@Transactional
	@Modifying
	@Query(value="UPDATE Member SET m_Pass = ?1 WHERE m_id = ?2", nativeQuery = true)
    Integer updateTempPw(String memPass, String memId);
	
	
	// 아이디로 회원 정보 찾기
	MemberVO findByMemId(String memId);
	
	
}
