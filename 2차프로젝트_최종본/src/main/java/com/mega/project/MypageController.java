package com.mega.project;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import oracle.sql.DATE;

@Controller // 클라이언트의 요청이 들어오면 제어하는 역할; 컨트롤러
public class MypageController {

	@Autowired
	MypageDAO dao; // 싱글톤으로 만들어놓은 객체가 있다면, 찾아서 주소를 넣어줌.
	
	@Autowired
	ProductDAO dao2; // 싱글톤으로 만들어놓은 객체가 있다면, 찾아서 주소를 넣어줌.
	
	//스트링으로 넘어온 상품번호들을 스플릿으로 나눠서 다시 배열에 담기
	@RequestMapping("mypageproduct")
	@ResponseBody
	public List<ProductVO> list100(String sum) {
		System.out.println( sum);
		String[] result = null;
		if (sum.length() > 0) {
			 result = sum.split(" ");
		}
		System.out.println(result[0]);
		
		String[] list = new String[result.length-1];
		for (int i = 0; i < list.length; i++) {
			list[i] = result[i+1];
			System.out.println(i+"번째: "+list[i]);
		}
		
		List<ProductVO> list1 = new ArrayList<ProductVO>();
		for(int i = 0; i < list.length; i++) {
			ProductVO bag = dao2.recentSelect2(list[i]);
			list1.add(bag);
		}
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		return list1;
	}
	
	
	@RequestMapping("my_insert")
	public void insert(MypageVO mypageVO) throws Exception {
		MypageVO check = dao.check(mypageVO);
		if (check == null) {
			dao.create(mypageVO);
			System.out.println("my_insert!!");
			// 입력값을 받아서 vo에 넣는 경우, 클래스 이름 첫글자를 소문자로 쓰는 경우 views아래 my_insert.jsp에서 사용할 수 있다.
		} else {
			System.out.println("중복된거 존재");
		}
	}
	
	//지수님 파트
	@RequestMapping("recent_select")
	public void select(String userid, Model model) throws Exception {
		System.out.println(userid);
		// 입력값을 받아서 vo에 넣는 경우, 클래스 이름 첫글자를 소문자로 쓰면, views아래 recent_select.jsp에서 사용할 수 있다.
		
		//아이디로 방문페이지 정보(페이지 넘버, 찜, 방문날짜) 출력
		List<MypageVO> mp = dao.read(userid);//방문페이지 정보(userid, pnum, liked, time2)를 담고 있는 리스트
		
		//상품정보의 내용(아래 리스트 sp에서 pnum으로 사용됨)을 추출하기 위해 필요한 pnum값들을 담은 리스트
		List<String> pnumList = new ArrayList<String>(); 
		for(int i = 0; i<mp.size(); i++) {
			pnumList.add(Integer.toString(mp.get(i).getPnum()));
		}
		
		//위에서 구한 pnum리스트를 통해 상품DAO로 접근하여 상품정보들을 출력한다.
		List<ProductVO> sp = new ArrayList<ProductVO>();
		for (int i = 0; i < mp.size(); i++) {
			sp.add(dao2.recentSelect2(pnumList.get(i))) ; //상품페이지에 해당하는 상품정보 추출
		}

		//방문페이지 정보를 담을 리스트 생성
		List<testVO> list2 = new ArrayList<testVO>();
		
		//1. testVO타입의 변수 list를 생성하고 방문페이지 정보를 담고있는 리스트 mp에서 필요한 데이터와 상품정보를 담고있는 리스트 sp에서 필요한 거 추출
		//2. 추출한 데이터를 담고있는 bag(list)을 리스트(List<testVO> list2 = new ArrayList<testVO>();)에 담는다.
		for (int i = 0; i < pnumList.size(); i++) {
			testVO list = new testVO();
			list.setUserid(mp.get(i).getUserid());
			list.setTime2((java.util.Date)mp.get(i).getTime2());
			list.setPnum(mp.get(i).getPnum());
			list.setLiked(mp.get(i).getLiked());
			list.setPname(sp.get(i).getPname());
			list.setPrice(sp.get(i).getPrice());
			list2.add(list);
		}
		
		/*
		 * for (int i = 0; i < list2.size(); i++) { System.out.println(list2.size());
		 * System.out.println("list2: "+list2); }
		 */
		model.addAttribute("list2",list2);// 방문페이지 정보를 담고 있는 리스트를 모델로 보낸다
	}
	
	@RequestMapping("recentSelect")
	@ResponseBody
	public List<ProductVO> recentSelect(@RequestParam(value = "pnum1") String pnum) {
//		System.out.println(pnum);
		MypageVO bag = dao.recentSelect(pnum);
		List<ProductVO> list = dao2.recentSelect(bag);
		// list는 vo에서 받아올 수 없어서 model로 받아줌
		return list;
	}
	
	//찜한 상품관련된거 => 최근방문이랑 비슷한 방법
	  @RequestMapping("liked_select") 
	  public void select2(String userid, Model model) throws Exception{ 
		  System.out.println(userid);
		  //입력값을 받아서 vo에 넣는 경우, 클래스 이름 첫글자를 소문자로 쓰면, views아래liked_select.jsp에서 사용할 수 있다. 
		  
		  	//아이디로 방문페이지 정보(페이지 넘버, 찜, 방문날짜) 출력
			List<MypageVO> mp = dao.read(userid);//방문페이지 정보(userid, pnum, liked, time2)를 담고 있는 리스트
			
			//상품정보의 내용(아래 리스트 sp에서 pnum으로 사용됨)을 추출하기 위해 필요한 pnum값들을 담은 리스트
			List<String> pnumList = new ArrayList<String>(); 
			for(int i = 0; i<mp.size(); i++) {
				pnumList.add(Integer.toString(mp.get(i).getPnum()));
			}
			
			//위에서 구한 pnum리스트를 통해 상품DAO로 접근하여 상품정보들을 출력한다.
			List<ProductVO> sp = new ArrayList<ProductVO>();
			for (int i = 0; i < mp.size(); i++) {
				sp.add(dao2.recentSelect2(pnumList.get(i))) ; //상품페이지에 해당하는 상품정보 추출
			}

			//찜한상품 확인
			List<testVO> list3 = new ArrayList<testVO>();
		  
			for (int i = 0; i < pnumList.size(); i++) {
				testVO list = new testVO();
				//조건 필요!!
				//찜이 1인 상품만 담을 수 있도록 설정
				if(mp.get(i).getLiked().equals("1")) {
				list.setUserid(mp.get(i).getUserid());
				list.setTime2((java.util.Date)mp.get(i).getTime2());
				list.setPnum(mp.get(i).getPnum());
				list.setLiked(mp.get(i).getLiked());
				list.setPname(sp.get(i).getPname());
				list.setPrice(sp.get(i).getPrice());
				list3.add(list);
				}
			}
		  
		  //lis는 vo에서 받아올 수 없어서 model로 받아줌
		  model.addAttribute("list3", list3); 
		  } 
	 
	@RequestMapping("basket")
	public void update(MypageVO mypageVO) throws Exception {
		System.out.println("담기성공");
		dao.update(mypageVO);
	}
	
	/*
	 * @RequestMapping("liked")
	 * 
	 * @ResponseBody public String liked(@RequestParam(value = "userid") String
	 * userid) throws Exception { System.out.println(userid); return "success"; }
	 */
	

	

}