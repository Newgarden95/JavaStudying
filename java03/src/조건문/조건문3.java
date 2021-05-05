package 조건문;

public class 조건문3 {

	public static void main(String[] args) {
		String food = "분식";
		
		switch(food) {
		case "분식":
			System.out.println("길건너로");
		case "양식":
			System.out.println("왼쪽으로");
		case "한식":
			System.out.println("오른쪽으로");
		default:
			System.out.println("집에서");
		}
		
	}

}
