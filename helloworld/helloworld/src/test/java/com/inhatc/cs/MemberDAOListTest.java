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

public class MemberDAOListTest{
	
	@Autowired
	private MemberDAO dao;
	
	
	
	@Test
	public void listCount() throws Exception{
		System.out.println(dao.listCount());
	}
	
	@Test
	public void listAll() throws Exception{
		System.out.println(dao.listAll());
	}
	

}