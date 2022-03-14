package com.inhatc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class CSController4 {
	
	
	@RequestMapping("doE")
	public String doE() {
		
		return "redirect:/doF";
	}
	
	@RequestMapping("doF")
	public void doF(String msg) {
		System.out.println(msg);
		System.out.println("doF");
	}

}
