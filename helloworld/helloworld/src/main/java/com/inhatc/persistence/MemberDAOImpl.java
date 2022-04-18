package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace="com.inhatc.mapper.memberMapper";
	
	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".insertMember",vo);
	}

	@Override
	public MemberVO readMember(String userid) throws Exception {
		return (MemberVO)sqlSession.selectOne(namespace+".readMember",userid);
	}

	@Override
	public MemberVO readMemberBypw(String userid, String userpw) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userid",userid);
		paramMap.put("userpw", userpw);
		return (MemberVO)sqlSession.selectOne(namespace+".readMemberBypw",paramMap);
	}

	@Override
	public void updateMember(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		
		sqlSession.update(namespace+".updateMember",vo);
		
	}

	@Override
	public void deleteMember(String userid) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+".deleteMember", userid);
		
	}

	@Override
	public int listCount() throws Exception {
		return sqlSession.selectOne(namespace+".listCount");
	}

	@Override
	public List<MemberVO> listAll() throws Exception {
		
		return sqlSession.selectList(namespace+".listAll");
		
	}
	
	
	
	
	
	
	
	
}
