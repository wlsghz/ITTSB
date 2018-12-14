package com.itt.service;

import java.util.List;

import com.itt.dto.MemberVO;

public interface MemberService {

	List<MemberVO> getMemberList() throws Exception;
	MemberVO getMemberBymNum(String mNum) throws Exception;
	void registerMember(MemberVO member) throws Exception;
	void modifyMember(MemberVO member) throws Exception;
	void removeMember(String mNum) throws Exception;

	
}
