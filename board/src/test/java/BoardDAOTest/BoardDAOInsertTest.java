package BoardDAOTest;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOInsertTest {
	
	@Inject
	private BoardDAO dao;
	
	@Test
	public void testInsert() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setTitle("title1");
		vo.setContent("content1");
		vo.setWriter("writer1");
		dao.create(vo);
		System.out.println(vo);
	}
	
}
