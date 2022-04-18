package com.inhatc.MenuTest;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.MemberVO;
import com.inhatc.domain.MenuVO;
import com.inhatc.domain.StudentVO;
import com.inhatc.persistence.Menu201844082DAO;
import com.inhatc.persistence.StudentInfoDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class Menu201844082DAOUpdateTest {
	
	@Inject
	private Menu201844082DAO dao;
	
	@Test
	public void updateStudent() throws Exception{
		
		MenuVO vo = new MenuVO();
		
		vo.setMenuId(0);
		vo.setMenuKind("양식cd");
		vo.setMenuName("파스타cd");
		vo.setMenuPrice(20000);
		System.out.println(vo);
		dao.updateMenu(vo);

	}

}
