package 데이터;
//ctrl + shift + f : 맨 처음 상태로 돌아감 => 자동 포맷팅

/*
 public class 는 하나의 클래스로 쉽게 생각해서 하나의 부품이라고 생각하면됨 -> 클래스 안에 메인 매소드가 없는 경우 실행 안되기 때문에 반드시 메인이 존재해야한다.
 */
public class 처음_부품이름 {

	public static void main(String[] args) {
		System.out.println("안녕하세요. 저는 신화원이에요.");         //시스템(System) -> 모니터(out) 
		System.out.println("저는 자바 초보입니다.");
		System.out.println("자바를 잘 배워서");
		System.out.println("훌륭한 개발자가 될거에요.");
		System.out.println("지켜봐 주세요.");
		
		for(int i = 0 ; i < 5; i++){  //int i = 0 -> i <5 -> for문 내부 loop -> i++ 순으로 진행
			System.out.println(i);
		}
	}

}
