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

public class MemberDAOTest{
	
	@Autowired
	private MemberDAO dao;
	
	

	@Test
	public void testTime() throws Exception{
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInsertMember() throws Exception{
		MemberVO vo = new MemberVO();
		
		vo.setUserid("user0");
		vo.setUserpw("userpw0");
		vo.setUsername("박훈희");
		vo.setEmail("user0@aser.com");
		
		dao.insertMember(vo);
	}
	
	

}