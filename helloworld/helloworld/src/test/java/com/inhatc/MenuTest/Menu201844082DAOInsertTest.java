package com.inhatc.MenuTest;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.MenuVO;
import com.inhatc.persistence.Menu201844082DAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class Menu201844082DAOInsertTest {
	
	@Inject
	private Menu201844082DAO dao;
	
	@Test
	public void testInsertMenu() throws Exception{
		MenuVO vo = new MenuVO();
		MenuVO vo1 = new MenuVO();
		MenuVO vo2 = new MenuVO();
		
		vo.setMenuId(0);
		vo.setMenuKind("양식");
		vo.setMenuName("파스타");
		vo.setMenuPrice(10000);
		vo1.setMenuId(1);
		vo1.setMenuKind("양식");
		vo1.setMenuName("파스타");
		vo1.setMenuPrice(10000);
		vo2.setMenuId(2);
		vo2.setMenuKind("양식");
		vo2.setMenuName("파스타");
		vo2.setMenuPrice(10000);
		
		dao.insertMenu(vo);
		dao.insertMenu(vo1);
		dao.insertMenu(vo2);
		System.out.println(vo);
		System.out.println(vo1);
		System.out.println(vo2);
	}

}
