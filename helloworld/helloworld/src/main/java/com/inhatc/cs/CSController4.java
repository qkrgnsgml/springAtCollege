package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class CSController4 {
	
	
	@RequestMapping("doE")
	public String doE(String msg,Model model) {
		return "redirect:/doF";
	}
	
	
	@RequestMapping("doF")
	public void doF(String msg) {
		System.out.println(msg);
		System.out.println("doF");
	}

}
