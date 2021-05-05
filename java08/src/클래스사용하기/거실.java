package 클래스사용하기;

import 클래스만들기.Dog;
import 클래스만들기.TV;

public class 거실 {

	public static void main(String[] args) {
		//int x = 100;
		//타입  변수명 = 값;
		//클래스명은 변수의 타입으로 사용할 수 있다.
		// 클래스명 변수명(객체이름) = new 클래스명();
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		tv1.color = "빨간색";
		tv1.size = 50;
				
		tv2.color = "검정색";
		tv2.size = 42;
		
		System.out.println(tv1.color);
		System.out.println(tv1.size);
		System.out.println(tv2.color);
		System.out.println(tv2.size);
		tv1.on();
		tv1.off();
		System.out.println();
		
		tv2.on();
		tv2.ch();
		
		System.out.println("---------------------");
		Dog dog = new Dog(); //dog는 총 3개의 변수를 갖음 : dog, type, age
							// dog안에는 type과 age를 가르키는 주소가 할당됨
		
		dog.type = "시바견";
		dog.age = 1;
		
		dog.짖기();
		dog.애교();
		dog.똥싸기();
		
		System.out.println(dog.type);
		System.out.println(dog.age);
	}

}
