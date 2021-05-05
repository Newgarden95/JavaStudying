package com.mega.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//상품등록 컨트롤러
/*
 * 상품등록시 위치테이블도 자동으로 작성되도록
 * 즉, 상품등록시 상품넘버, 상품주소를 통해 위치테이블 생성(주소-> 위도경도 변환)
 */
public class PdController {

	@Autowired
	PdDAO dao;
	
	@RequestMapping("geo")
	public void insert(PdVO vo) {
		dao.insert(vo);
		
		//상품등록시 위치정보테이블 기능도 설정하기
		
	}
	
}
