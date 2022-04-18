package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.MenuVO;

public interface Menu201844082DAO {
	
	public void insertMenu(MenuVO vo);
	
	public MenuVO selectMenu(int menuId) throws Exception;
	
	public void updateMenu(MenuVO vo) throws Exception;
	
	public void deleteMenu(int menuId)throws Exception;
	
	public int listCount() throws Exception;
	
	public List<MenuVO> listAll() throws Exception;

}
