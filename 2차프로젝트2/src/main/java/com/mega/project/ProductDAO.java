package com.mega.project;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// 어노테이션의 기능 해당 클래스가 특정한 역할을 하게 등록한다, 싱글톤으로 만들어준다. 2가지
// 한개만 객체생성, 한개만 만드는게 싱글톤
// 같은 주소값을 계속 가져다가 사용한다.

public class ProductDAO {

	@Autowired
	SqlSessionTemplate my; // mybatis 사용하는 싱글톤

	// 상품 등록 관련 crud 생성

	// 상품 등록(create)
	public void insert(ProductVO bag) { // 컨트롤러에서 dao.insert 기능을 사용하면 아래를 실행
		my.insert("product.insert", bag); // mybatis의 기능중 insert를 실행
		// mybatis를 활용해서 mapper에 있는 namespace가 product 중 에서 insert라는 id를 가진 기능을 수행
		System.out.println("맵퍼 보내기 성공");
		// my.insert가 실행됫는지 확인 하는 출력값
	}

	// 상품 조회(read)
	public List<ProductVO> read(ProductVO bag) {
		if (bag.getContact().equals("01011111111")) {
			List<ProductVO> list = my.selectList("product.all", bag);
			System.out.println("맵퍼 보내기 성공");
			return list;
		} else {
			List<ProductVO> list = my.selectList("product.select", bag);
			System.out.println("맵퍼 보내기 성공");
			return list;
		}
	}

	// 상품 상세 조회(read)
	public ProductVO pdetail(ProductVO bag) {
		System.out.println("맵퍼 보내기 성공");
		return my.selectOne("product.detail", bag);
	}

	// 상품 수정(update)
	public void update(ProductVO bag) {
		my.update("product.update", bag);
		System.out.println("맵퍼 보내기 성공");
	}

	// 상품 삭제(delete)
	public void delete(ProductVO bag) {
		my.delete("product.delete", bag);
		System.out.println("맵퍼 보내기 성공");
	}
	
	  // 상품 추천(선종님)
	  public List<ProductVO> recommend(RuserVO bag) {
		  return my.selectList("product.recommend", bag);
	   }
	
	/*
	 * 신화원 
	 * 상품정보를 가져올 경우의 수에 해당하는 쿼리문을 수행할 메서드들
	 * 총 8가지 경우
	 * */
	// 전체 상품 목록 가져오기
	public List<ProductVO> productList() {
		return my.selectList("product.productList");
	}
	// 원룸, 아파트, 오피스텔 타입(방종류)만 선택된 경우
	public List<ProductVO> selectPlist1(ProductVO bag) {
		return my.selectList("product.productList1",bag);
	}
	// 월세, 전세, 매매 타입(거래유형)만 선택된 경우
	public List<ProductVO> selectPlist2(ProductVO bag) {
		return my.selectList("product.productList2",bag);
	}
	// 세권 타입만 선택된 경우
	public List<ProductVO> selectPlist3(ProductVO bag) {
		return my.selectList("product.productList3",bag);
	}
	// 방종류&거래유형 두개가 선택된 경우
	public List<ProductVO> selectPlist4(ProductVO bag) {
		return my.selectList("product.productList4",bag);
	}
	// 방종류&세권유형 두개가 선택된 경우
	public List<ProductVO> selectPlist5(ProductVO bag) {
		return my.selectList("product.productList5",bag);
	}
	// 거래유형&세권유형 두개가 선택된 경우
	public List<ProductVO> selectPlist6(ProductVO bag) {
		return my.selectList("product.productList6",bag);
	}
	// 방종류&거래유형&세권유형 모두 선택된 경우
	public List<ProductVO> selectPlist7(ProductVO bag) {
		return my.selectList("product.productList7",bag);
	}
	
	public ProductVO productDetailList(String pnum) {
		return my.selectOne("product.productDetailList", pnum);
	}
}
