package com.mega.mvcproject02;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QnaDAO {
	
	// myBatis 싱클톤 주소를 주입!
	@Autowired
	SqlSessionTemplate my;
	
	public void create(QnaVO bag) throws Exception {
		// myBatis에 실행시킬 예정
		my.insert("qna.insert", bag);
	}
	public void delete() {

	}

}
