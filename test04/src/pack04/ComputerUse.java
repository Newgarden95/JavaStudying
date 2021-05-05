package pack04;

public class ComputerUse {
	public static void main(String[] args) {
		Computer com1 = new Computer(600000, "red", "lg"); //컴퓨터 객체 생성
		Computer com2 = new Computer(800000, "blue", "samsung");// 컴퓨터 객체 생성
		
		System.out.println(com1); //com1의 멤버변수값 출력
		System.out.println(com2); //com2의 멤버변수값 출력
		
		com1.on(); //com1의 on메서드 호출
		com2.off(); //com2의 off메서드 호출
	}
}
