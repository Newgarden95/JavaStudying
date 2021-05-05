package com.mega.mvcTest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class CartDAO {
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(CartVO bag) {
		my.insert("cart.insert", bag);
		System.out.println("db입력 성공!!");
	}
}
