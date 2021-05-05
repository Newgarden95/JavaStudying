package com.mega.mvc2000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired//싱글톤으로 만든 주소
	ProductDAO dao; //싱글톤으로 설정된 ProductDAO 
					//초기설정: 객체 1번만 선언하면 객체생성할 필요 없이 계속 사용 가능
	
	@RequestMapping("insert11")
	
	public void insert(ProductVO bag) throws Exception {
		System.out.println("db처리중");
		dao.insert(bag);
		System.out.println("db처리 성공");
		System.out.println("입력된 id: "+bag.getId());
		System.out.println("입력된 title: "+bag.getTitle());
		System.out.println("입력된 price: "+bag.getPrice());
		System.out.println("입력된 company: "+bag.getCompany());
	}
}
