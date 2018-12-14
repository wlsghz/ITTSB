package com.itt.service;

import java.util.List;

import com.itt.dao.MemberDAO;
import com.itt.dto.MemberVO;

public class MemberServiceImpl implements MemberService{

	private MemberDAO memberDAO;
	public void setMemberDAO(MemberDAO memberDAO){
		this.memberDAO=memberDAO;					
	}
	
	@Override
	public List<MemberVO> getMemberList() throws Exception {
		List<MemberVO> memberList = memberDAO.selectMemberList();
		return memberList;
	}

	@Override
	public MemberVO getMemberBymNum(String mNum) throws Exception {
		MemberVO member = memberDAO.selectMemberBymNum(mNum);
		return member;
	}

	@Override
	public void registerMember(MemberVO member) throws Exception {

		memberDAO.insertMember(member);
	}

	@Override
	public void modifyMember(MemberVO member) throws Exception {

		memberDAO.updateMember(member);
	}

	@Override
	public void removeMember(String mNum) throws Exception {

		memberDAO.deleteMember(mNum);
	}
	
}
