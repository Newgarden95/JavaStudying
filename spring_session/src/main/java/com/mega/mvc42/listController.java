package com.mega.mvc42;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class listController {
	//Plain Old Java Object: POJO
	//평범한 옛날부터 쓰던 자바 객체
	
	@RequestMapping("fruit")
	public void fruit(Model model) {
		//db목록을 모델에 담아서 넘기기(if> 리스트를 넘기는 경우)
		ArrayList<String> fruit = new ArrayList<String>(); 
		fruit.add("바나나");
		fruit.add("멜론");
		fruit.add("딸기");
		fruit.add("참외");
		
		model.addAttribute("fruit", fruit);
	}

	@RequestMapping("tour")
	public void tour(Model model) {
		ArrayList<String> tour = new ArrayList<String>();
		tour.add("제주도");
		tour.add("미국");
		tour.add("영국");
		tour.add("일본");
		tour.add("평창");
		
		model.addAttribute("tour", tour);
	}
	
}
