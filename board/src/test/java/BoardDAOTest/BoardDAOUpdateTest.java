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

public class BoardDAOUpdateTest {
	
	@Inject
	private BoardDAO dao;
	
	@Test
	public void updateStudent() throws Exception{
		
		BoardVO vo = new BoardVO();
		
		vo.setBno(3);
		vo.setTitle("titlecd");
		vo.setContent("contentcd");
		System.out.println(vo);
		dao.update(vo);

	}

}
