package com.inhatc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.ProductVO;

@Controller
public class CSController3 {
	
	
	@RequestMapping("doD")
	public String doD(Model model) {
		ProductVO product1 = new ProductVO("제품1",10000);
		ProductVO product2 = new ProductVO("제품2",20000);
		System.out.println("doD Called");
		model.addAttribute(product1);
		model.addAttribute(product2);
		return "productDetail";
	}

}
