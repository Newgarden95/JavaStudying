package 형변환;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 참조형형변환4 {

	public static void main(String[] args) {
		//객체 설계할 때  2대 원칙
		//1. 객체를 만들때는 하나의 클래스안에는 하나의 역할만을 정의해야한다. => 응집도(Cohesion) 높게!
		//2. 결합시 특정한 클래스만 지정하여 설계하면 안된다. => 결합도(Coupling) 낮게!
		
		맨 m = new 맨(); //죽어라 맨만 써야함

		//하나의 이름으로 다양한 형태를 구현하여 사용하는 자바의 이 특징
		//자동형변환으로 가능, 오버로딩(CPU Ram에 넣는것)  => 다형성(하나의 이름으로 여러가지 형태를 구현하는 특징) : 메서드 다형성, 클래스 다형성
		
		//Object는 너무 커서 안되고 사용하는 클래스중 범위가 가장 큰 코드를 왼쪽에 설정해!!!
		//결합도가 낮은 코드는 유지보수하기도 좋고 , 더 좋은 성능을 가진 클래스로 변경에 용이!!!
		사람 m2 = new 맨(); //자동형변환 됨 ~> 이게 더 좋은 코드 : 결합도가 훨씬 낮음 => 왼쪽을 큰걸로 맞추면 오른쪽을 수정할 떄 왼쪽만 맞추면 됨 
		m2 = new 우먼();
		m2 = new 슈퍼맨(); // 이런것 처럼 고쳐가면서 사용하기 편함(수정에 용이)
		m2.eat();
		
		((맨) m2).run();

	ArrayList list2 = new ArrayList();
	//좋은 코드	
	List list = new ArrayList(); 	//아래거 쓸지 현재거 쓸지 아직 모르니까
	list = new LinkedList();
	}
}
