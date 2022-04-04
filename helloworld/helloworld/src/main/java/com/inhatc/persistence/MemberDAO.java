package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.MemberVO;

public interface MemberDAO {
	public String getTime();
	
	public void insertMember(MemberVO vo);
	
	public MemberVO readMember(String userid) throws Exception;
	
	public MemberVO readMemberBypw(String userid, String userpw) throws Exception;
	
	public void updateMember(MemberVO vo) throws Exception;
	
	public void deleteMember(String userid)throws Exception;
	
	public int listCount() throws Exception;
	
	public List<MemberVO> listAll() throws Exception;
}
