package com.itt.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.itt.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO{

	private SqlSession session;
	public void setSession(SqlSession session){
		this.session=session;
	}
	
	@Override
	public List<MemberVO> selectMemberList() throws Exception {

		List<MemberVO> memberList = session.selectList("Member.selectMemberList"); 
		return memberList;
	}

	@Override
	public MemberVO selectMemberBymNum(String mNum) throws Exception {

		MemberVO member = session.selectOne("Member.selectMemberBymNum",mNum);
		return member;
	}

	@Override
	public void insertMember(MemberVO member) throws Exception {

		session.update("Member.insertMember",member);
	}

	@Override
	public void updateMember(MemberVO member) throws Exception {

		session.update("Member.updateMember",member);
	}

	@Override
	public void deleteMember(String mNum) throws Exception {

		session.update("Member.deleteMember",mNum);
	}
	
}
