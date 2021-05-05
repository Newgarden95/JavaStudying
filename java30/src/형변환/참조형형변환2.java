package 형변환;

import java.util.ArrayList;
import java.util.Random;

public class 참조형형변환2 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); //<> 를 쓰는 순간 형변환을 하지 않겠다라는 뜻
		list.add("홍길동"); //String이었던게 Object로 자동 형변환됨 why? 기본적으로 모든 것들은 다 object 상속받았기 때문에 다 들어감
		list.add(new 맨()); //참조형클래스 맨(Object) 
		list.add(new Random());//
		list.add(new 슈퍼맨());//
		
		list.get(0).charAt(0);//String에서 추가된 메서드들은 바로 쓸 수 없다. -> 현재 Object형임
		
		//따라서 위의 기능을 사용하기 위해서는 강제형변환을 통해 사용
		String name = (String)list.get(0); // 강제 형변환
		맨 man = (맨)list.get(3);
		man.run();

	}
}
