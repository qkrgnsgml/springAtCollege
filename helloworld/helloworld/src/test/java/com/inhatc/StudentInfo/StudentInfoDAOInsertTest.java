package com.inhatc.StudentInfo;

import javax.inject.Inject;

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

public class StudentInfoDAOInsertTest {
	
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void testInsertStudent() throws Exception{
		StudentVO vo = new StudentVO();
		StudentVO vo1 = new StudentVO();
		StudentVO vo2 = new StudentVO();
		
		vo.setStudentid("user0");
		vo.setStudentname("박훈희");
		vo.setAddress("인천");
		vo.setEmail("user0@aser.com");
		vo.setCellphone("0102323123213");
		vo1.setStudentid("user1");
		vo1.setStudentname("박훈희");
		vo1.setAddress("인천");
		vo1.setEmail("user0@aser.com");
		vo1.setCellphone("0102323123213");
		vo2.setStudentid("user2");
		vo2.setStudentname("박훈희");
		vo2.setAddress("인천");
		vo2.setEmail("user0@aser.com");
		vo2.setCellphone("0102323123213");
		
		dao.insertStudent(vo);
		dao.insertStudent(vo1);
		dao.insertStudent(vo2);
		System.out.println(vo);
		System.out.println(vo1);
		System.out.println(vo2);
	}

}
