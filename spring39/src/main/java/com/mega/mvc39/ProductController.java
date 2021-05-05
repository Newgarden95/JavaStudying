package com.mega.mvc39;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@Autowired
	ProductDAO db;
	
	@RequestMapping("select3")
	public void select(ProductVO productVO, Model model) {
		ProductVO vo = db.select(productVO);
		model.addAttribute("vo", vo);
	}
}
