package com.inhatc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inhatc.domain.ProductVO;

@Controller
public class CSController5 {
	
	
	@RequestMapping("doJSON")
	@ResponseBody
	public ProductVO doJSON() {
		ProductVO product1 = new ProductVO("제품1",10000);
		System.out.println("doJSON Called");
		return product1;
	}

}
