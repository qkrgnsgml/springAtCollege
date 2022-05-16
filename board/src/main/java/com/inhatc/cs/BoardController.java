package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;
import com.inhatc.domain.PageMaker;
import com.inhatc.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(BoardVO board) throws Exception{
		System.out.println("Request register (GET)");
		//return "/board/register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(BoardVO board) throws Exception{
		System.out.println("Request register (POST)");
		service.regist(board);
		return "redirect:/board/listAll";
		
	}
	
	@RequestMapping(value="/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception{
		List<BoardVO> list = service.listAll();
		model.addAttribute("list", list);
		System.out.println("Request List All");
	}
	
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model)throws Exception{
		System.out.println("bno: " +bno);
		model.addAttribute("boardVO", service.read(bno));
	}
	
	@RequestMapping(value="/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr)throws Exception {
		service.remove(bno);
	
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value="/modify", method = RequestMethod.GET)
	public void modifyGET(int bno, Model model) throws Exception{
		model.addAttribute(service.read(bno));
	}
	
	@RequestMapping(value="/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception{
		service.modify(board);
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value="/listCri", method = RequestMethod.GET)
	public void listCri(Criteria cri, Model model) throws Exception{
		List<BoardVO> list = service.listCriteria(cri);
		model.addAttribute("list", list);
		System.out.println("Request List Cri");
	}
	
	@RequestMapping(value="/listPage", method = RequestMethod.GET)
	public void listPage(Criteria cri, Model model) throws Exception{
		List<BoardVO> list = service.listCriteria(cri);
		model.addAttribute("list", list);
		System.out.println("Request List Page");
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listCountCriteria(cri));
		model.addAttribute("pageMaker",pageMaker);
	}

}
