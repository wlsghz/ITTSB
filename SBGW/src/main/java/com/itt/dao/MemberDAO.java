package com.itt.dao;

import java.util.List;

import com.itt.dto.MemberVO;

public interface MemberDAO {
	
		List<MemberVO> selectMemberList() throws Exception;
		MemberVO selectMemberBymNum(String mNum) throws Exception;
		void insertMember(MemberVO member) throws Exception;
		void updateMember(MemberVO member) throws Exception;
		void deleteMember(String mNum) throws Exception;

}
