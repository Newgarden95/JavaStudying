package 리뷰문제0708;

public class Car { //최상의 클래스
	//회사&연식
	String company;
	int year;
	
	//생성자
	public Car(String company, int year) {
		this.company = company;
		this.year = year;
	}
	public void info() { 
		System.out.println("이 차량은 "+year+"년식 "+company+"사 차량입니다.");
	}
	public void hi() {
		System.out.println("저희 "+company+"를 사용해주셔서 감사합니다.");
	}

	@Override
	public String toString() {//Object의 메서드를 오버라이딩하여 주소가아닌 변수가 출력되도록 재정의
		return "Car [company=" + company + ", year=" + year + "]";
	}
}
