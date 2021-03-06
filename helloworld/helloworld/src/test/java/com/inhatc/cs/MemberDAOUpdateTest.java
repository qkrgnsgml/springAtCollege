package com.inhatc.cs;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.MemberVO;
import com.inhatc.persistence.MemberDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class MemberDAOUpdateTest{
	
	@Autowired
	private MemberDAO dao;
	
	
	@Test
	public void updateMember() throws Exception{
		
		MemberVO vo = new MemberVO();
		
		vo.setUserid("user0");
		vo.setUserpw("userpw0cd");
		vo.setUsername("박훈희cd");
		vo.setEmail("user0@cd.com");
		
		dao.updateMember(vo);

	}
	
	

}