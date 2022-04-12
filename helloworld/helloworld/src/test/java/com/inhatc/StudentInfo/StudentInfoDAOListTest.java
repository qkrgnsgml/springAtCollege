package com.inhatc.StudentInfo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.StudentVO;
import com.inhatc.persistence.StudentInfoDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class StudentInfoDAOListTest {
	
	@Autowired
	private StudentInfoDAO dao;
	
	@Test
	public void listAll() throws Exception{
		System.out.println(dao.listAll());
	}

}