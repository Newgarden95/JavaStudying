package com.mega.mvc39;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public ProductVO select(ProductVO bag) {
		return my.selectOne("product.select",bag);
	}
}
