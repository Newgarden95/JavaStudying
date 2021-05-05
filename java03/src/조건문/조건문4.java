package 조건문;

public class 조건문4 {

	public static void main(String[] args) {
		int choice = 0; //인기투표에서 아이유를 원하면 0번을 누르시오
		
		switch(choice) {
		case 0:
			System.out.println("아이유 선택");
			break;
		case 1:
			System.out.println("수지 선택");
			break;
		case 2:
			System.out.println("박혜수 선택");
			break;
		default:
			System.out.println("해당 연예인이 없습니다");
			break;
		}
	}

}
