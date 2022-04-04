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

public class MemberDAOReadTest{
	
	@Autowired
	private MemberDAO dao;
	
	
	@Test
	public void readMember() throws Exception{
		
		MemberVO member = dao.readMember("user0");
		
		System.out.println(member);

	}
	
	@Test
	public void readMemberBypw() throws Exception{
		
		MemberVO member = dao.readMemberBypw("user0","userpw0cd");
		
		System.out.println(member);

	}

}