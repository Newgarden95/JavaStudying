package 형변환;

import java.util.ArrayList;
import java.util.Random;

public class 참조형형변환5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //<> 를 쓰는 순간 형변환을 하지 않겠다라는 뜻
		
		//입력시 자동형변환 Object로 변환되어 들어감
		//자동형변환 단점: 부가적으로 추가된 기능등을 쓸 수 없다.
		//add()안에는 다 들어감 왜냐면 object상속을 받은거라 기본적으로 모든 것들은 다 object 상속받았기 때문에 다 들어감
		list.add("홍길동"); //0번
		list.add(100); //기본형과 오브젝트와의 상속관계가 없는데 들어가짐  ~> int(기본형) ------auto-boxing------> Integer(참조형) --------->upcasting ----->Object
		list.add(11.12);
		System.out.println(list);
		
		int num =(Integer)list.get(1);//int(기본형) <------auto-boxing <------ Integer(참조형) <--------- downcasting <-------- Object

	}
}
