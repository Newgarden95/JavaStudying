package com.mega.project;
//�긽�뭹 �쐞移� �뀒�씠釉붿뿉 ���븳 而⑦듃濡� �빐二쇰뒗 而⑦듃濡ㅻ윭

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PlController {
	@Autowired
	ProductLocationDAO dao;
	
	@RequestMapping("pl_insert.mega")
	public void insert(ProductLocationVO bag) throws Exception {
		dao.insert(bag);
		System.out.println("�뜲�씠�꽣 諛섑솚 �꽦怨�");
		System.out.println(bag.pid);
		System.out.println(bag.platitude);
		System.out.println(bag.plongtitude);
	}
	
}
