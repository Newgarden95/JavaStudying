package com.mega.project;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //스프링에 이 클래스를 싱글톤으로 만들어달라고 세팅
			//MypageDAO dao = new MypageDAO();
public class MypageDAO {
	//myBatis싱글톤 주소를 주입!
	@Autowired
	SqlSessionTemplate my;
	
	//최근 본 상품 추가 (create)
	public void create(MypageVO bag) throws Exception {
		my.insert("mypage.insert", bag);
	}
	//최근 본 상품 조회 (read)
	public List<MypageVO> read(String userid){
		return my.selectList("mypage.select", userid);
	}
	// 찜한 상품 업데이트 (update)
	public void update(MypageVO bag) throws Exception {
		my.update("mypage.update", bag);
	}
	//최근 본 상품 삭제 (delete)
	public int delete(MypageVO bag) {
		return my.delete("mypage.delete", bag);
	}
	
	//중복체크
	public MypageVO check(MypageVO bag) {
		return my.selectOne("mypage.check", bag);
	}
	
	//중복체크
	public MypageVO recentSelect(String pnum) {
		return my.selectOne("mypage.recentselect", pnum);
	}
	
}
