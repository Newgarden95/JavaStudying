package com.mega.mvc400;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	
	//싱글톤 객체 생성(DAO)
	@Autowired
	CartDAO db;
	
	//어노테이션 사용하여 가상주소 받아주기
	@RequestMapping("cart")
	public void insert(CartVO cartVO) {
		
		db.insert(cartVO);
		System.out.println("입력된 내 아이디는 "+ cartVO.mid);
		System.out.println("입력된 상품 아이디는 "+ cartVO.pid);
		System.out.println("입력된 상품 가격은 "+ cartVO.price);
		System.out.println("입력된 상품 수량은 "+ cartVO.pcount);
		
		System.out.println("views파일로 이동");
	}
}
