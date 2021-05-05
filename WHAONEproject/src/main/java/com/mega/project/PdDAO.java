package com.mega.project;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PdDAO {
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(PdVO bag) {
		//System.out.println("실패");
		my.insert("pd.insert",bag);
		System.out.println("상품입력성공");
	}
}
