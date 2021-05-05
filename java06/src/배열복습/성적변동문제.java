package 배열복습;

public class 성적변동문제 {

	public static void main(String[] args) {
		String[] name = {"홍길동","김길동","송길동","박길동","정길동"};
		int[] term1 = {77,88,99,55,70};
		int[] term2 = {99,100,88,80,70};
		
		//1. 성적이 2학기에 향상된 학생의 수
		int count = 0;
		for (int i = 0; i < name.length; i++) {
			if (term2[i] > term1[i]) { //int형 기본형 데이터니까 
				count++;
				System.out.println("2학기에 성적이 향상됨");
			}
			System.out.println("향상된 학생의 이름은 "+name[i]+"입니다.");
		}
		System.out.println("성적이 향상된 학생은 "+count+"명 입니다.");
		
		System.out.println(" ");
		//1학기 2학기 성적이 동일한 사람
		int count2 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == term1[i]) { //기본형 데이터기 때문에
				count2++;
				System.out.println("성적이 동일한 학생은" +(i+1)+ "번째 학생입니다.");
			}
		}
		System.out.println("동일한 성적의 학생의 수는 "+ count2+"명입니다.");
	
		System.out.println("========================================");
		System.out.println("for문을 2번 돌리지 말고 한번에 할수 없을까?");
		int count3 = 0; //향상된 학생의 수
		int count4 = 0; //동일한 학생의 수
		
		for (int i = 0; i < term2.length; i++) {
			if(term1[i] == term2[i]) {
				count4++;
			}else if(term1[i]<term2[i]) {
				count3++;
			}
		}
		System.out.println("향상 "+count3+"명");
		System.out.println("동일 "+count4+"명");
	
	
	
	}
		


}
