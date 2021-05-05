package com.mega.project;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SelectController {
	
	@Autowired
	PlDAO dao;
	
	@RequestMapping("select")
	//JSP(브라우저)에서 AJAX를 통해 보낸 배열을 컨트롤러에서 받는 방법
	//파라미터로 @RequestParam(value = "보낸 데이터 키값(아이디값)[]" List<타입> 변수명)
	//										AJAX로 보낸 데이터(배열)	 받는 데이터가 배열(List)
	public void category(@RequestParam(value = "arr[]") List<String> arr) {
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		String roomType = arr.get(0);
		String saleType = arr.get(0);
		String sectionType = arr.get(0);
		//상품테이블로 보내줌
		
	}
	
	//상품 위치 정보 데이터 리스트 받기
	@ResponseBody
	@RequestMapping("gettingJson")
	//PLVO변경해서 사용못함
	public List<PlVO> toJson() {
		List<PlVO>list = dao.select(); //VO를 담은 리스트
		return list;
	}
	
	@ResponseBody
	@RequestMapping("address")
	public List<PlVO> address() {
		List<PlVO>list = dao.select(); //VO를 담은 리스트
		return list;
	}
	
	
	@ResponseBody //뷰 페이지를 응답하지 않고 return 값을 그대로 반환하겠다는 의미
	@RequestMapping("getJson")
	public String sendJson() {
		return "check";
	}

	
	@RequestMapping("page")
	public void paging() {
		
	}
}
