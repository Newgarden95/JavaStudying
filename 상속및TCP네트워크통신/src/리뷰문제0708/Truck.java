package 리뷰문제0708;

public class Truck extends Car {
	//차량 무게
	int size;
	//생성자
	public Truck(String company, int year, int size) {
		super(company, year);
		this.size = size;
	}
	public void truckInfo() {
		System.out.println("트럭의 무게는 "+size+"톤 입니다.");
	}
	@Override
	public String toString() {
		return "Truck [size=" + size + "]";
	}
}
