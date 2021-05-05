package 배열심화;

public class 기본형복사 {

	public static void main(String[] args) {
		int x = 100;
		int y = x; //기본형 복사(주소 다름)
		System.out.println("변경전 x: "+ x);
		System.out.println("변경전 y: "+ y);
		
		x = 200;
		System.out.println("변경후 x: "+ x);
		System.out.println("변경후 y: "+ y);
		
	}

}
