package com.mega.mvc2000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 컨트롤러에 역할을 하겠다라고 선언(상속)
			// 해당 클래스가 컨트롤러 클래스임을 spring framework에 전달함
public class MemberController {

	@Autowired
	MemberDAO dao; // 싱글톤으로 만들어진 객체의 주소를 만들기

	// check부분에 1번에 해당하는곳 메서드 만드는것 데이터 받아주는 부분
	// 컨트롤 클래스 => 어떤 데이터를 받을지와 어떤 뷰를 보여줄지 결정해주는 부분 C
	@RequestMapping("login.mega") // 클라이언트 요청사항을 맵핑해줌(form action으로 넘어온 내용들) 가상의 주소: login.mega
									// ~> 그 아래있는 메서드를 실행하고 views밑에 login과 같은 jsp로 넘겨준
	public String login(String id, String pw, String pw2) { // request.getParameter까지는 스프링이 알아서 해줌 따라서 그냥 변수만 받아주면됨
															// return값이 있는 경우는 return 값에 해당하는 페이지로 넘겨줌
		System.out.println("내가 호출됨");
		System.out.println("컨트롤 하는 메서드");
		System.out.println("컨트롤러에서 받은 id: " + id);
		System.out.println("컨트롤러에서 받은 pw: " + pw);
		System.out.println("컨트롤러에서 받은 pw2: " + pw2);

		// 처리 여부에 따라 어느 뷰로 넘어갈지를 결정
		boolean result = false; // 로그인이 안되었을때
		if (id.equals("root") && pw.equals("1234")) {
			result = true;
		}
		if (result) {
			return "ok"; // views 아래에 있는 ok.jsp 를 찾아줌 -> 다음페이지를 지정해줌 항상주소를 주어야하기 때문에 controller에서 return은
							// string형태
		} else {
			return "no"; // views 아래에 있는 no.jsp 를 찾아줌
		}
	}

	@RequestMapping("insert.mega") // 어노테이션 requestmapping을 통해 insert.jsp에서 넘어온 요청을 맵핑
									// 맵핑 확인 후 아래 insert() 메서드를 실행
									// 그 후 @RequestMapping("insert.mega") 괄호안에 있는 insert라는 이름과 같은 views아래 jsp파일을
									// 호출하고 클라이언트에게 보내준다.

	public void insert(MemberVO bag) throws Exception { // 알아서 객체 생성해줌~> spring에서 new MemberVO + set메서드역할을 알아서 해줌
														// DB처리인 DAO도 선언만해주면 바로 사용 가능=>하지만 DAO는 싱글톤으로 설정했기 때문에
		// public void insert(String id, String pw, String name, String tel)
		// set부분 자동 처리
		dao.create(bag);// 예외처리 필수
		System.out.println("(싱글톤)dao의 주소 >>" + dao);
		System.out.println("(프로토타입)vo의 주소 >>" + bag);
		System.out.println("내가 호출됨");
		System.out.println("컨트롤 하는 메서드");
		System.out.println("컨트롤러에서 받은 id: " + bag.getId());
		System.out.println("컨트롤러에서 받은 pw: " + bag.getPw());
		System.out.println("컨트롤러에서 받은 name: " + bag.getName());
		System.out.println("컨트롤러에서 받은 tel: " + bag.getTel());
	}

	@RequestMapping("delete.mega") // 클라이언트의 요청사항을 받아 맵핑 -> delete 메서드 실행
	public String delete(String id, MemberDAO dao) throws Exception {
		if (dao.check(id) == true) {
			dao.delete(id); // model 실행(db처리)
			System.out.println("삭제 성공");
			return "login";
		} else {
			System.out.println("입력하신 아이디는 없습니다.");
			return "delete1";
		}

	}
}
