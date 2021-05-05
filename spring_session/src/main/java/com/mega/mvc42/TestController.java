package com.mega.mvc42;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	   @Autowired
	   TestService text;

	   @RequestMapping("text")
	   public void text(String tel, Model model) {
	      System.out.println("컨트롤러까지 요청됨. 도착한 데이터는 " + tel);
	      int num2 = text.text(tel);
	      model.addAttribute("num2", num2);
	   }
	   
	   @RequestMapping("movie")
	   public void movie(movieVO vo, Model model1) {
		   model1.addAttribute("vo", vo);
	   }
	   
	   @RequestMapping("receipt")
	   public void receipt(receiptVO vo, Model model2) {
		   vo.total = Integer.parseInt(vo.com)+Integer.parseInt(vo.mouse);
		   System.out.println(vo.total);
		   model2.addAttribute("vo", vo);
	   }
}
