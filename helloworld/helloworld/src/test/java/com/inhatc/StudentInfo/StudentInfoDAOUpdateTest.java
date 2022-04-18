package com.inhatc.StudentInfo;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.MemberVO;
import com.inhatc.domain.StudentVO;
import com.inhatc.persistence.StudentInfoDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class StudentInfoDAOUpdateTest {
	
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void updateStudent() throws Exception{
		
		StudentVO vo = new StudentVO();
		
		vo.setStudentid("user0");
		vo.setStudentname("박훈희cd");
		vo.setAddress("인천cd");
		vo.setEmail("user0@aser.cd");
		vo.setCellphone("01023231cd");
		System.out.println(vo);
		dao.updateStudent(vo);

	}

}
