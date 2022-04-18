package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MenuVO;
import com.inhatc.domain.StudentVO;

@Repository
public class Menu201844082DAOImpl implements Menu201844082DAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace="com.inhatc.mapper.Menu201844082Mapper";
	
	
	@Override
	public void insertMenu(MenuVO vo) {
		sqlSession.insert(namespace+".insertMenu",vo);
		
	}

	@Override
	public MenuVO selectMenu(int menuId) throws Exception {
		return (MenuVO)sqlSession.selectOne(namespace+".selectMenu",menuId);
	}

	@Override
	public void updateMenu(MenuVO vo) throws Exception {
		sqlSession.update(namespace+".updateMenu",vo);
		
	}

	@Override
	public void deleteMenu(int menuId) throws Exception {
		sqlSession.delete(namespace+".deleteMenu", menuId);
		
	}

	@Override
	public int listCount() throws Exception {
		return sqlSession.selectOne(namespace+".listCount");
	}

	@Override
	public List<MenuVO> listAll() throws Exception {
		return sqlSession.selectList(namespace+".listAll");
	}
	

}
