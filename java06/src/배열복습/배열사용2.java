package 배열복습;

public class 배열사용2 {

	public static void main(String[] args) {
		String[] name = {"홍길동","박길동","정길동","이길동"};
		for (int i = 0;  i < name.length; i++) {
			System.out.println(name[i]);
		}
		for (String s : name) { //s는출력용 즉, 첫번째 loop때 s에는 홍길동 들어가서 출력 이런식으로 박길동 정길동 ... 총 4번의 반복
			System.out.println(s+" ");
		}
		//char 성별넣고, 출력
		//boolean 아침먹었나 넣고, 출력
		//double 시력넣고, 출력
		//int 나이넣고, 출력
		//for-each문으로 확인해보기 => 단순 출력은 for-each가 더 강력함
		
		String[] sex = {"남자", "여자","여자","남자"};
		boolean[] morning = {true,true,true,false};
		double[] eye = {1.05, 0.55,1.50,0.30};
		int[] age = {60,56,29,27};
		
		System.out.println("이름: "+name[0]+" "+"성별: "+sex[0]+" "+"아침: "+morning[0]+ " "+"시력: "+ eye[0]+ " "+"나이: "+age[0]);
		System.out.println("================================================");
		System.out.println("가족에 대한 정보");
		for (int i = 0; i < age.length; i++) {
			System.out.println("이름: "+name[i]+" "+"성별: "+sex[i]+" "+"아침: "+morning[i]+ " "+"시력: "+ eye[i]+ " "+"나이: "+age[i]);
		}
		System.out.println("================================================");
		
		//for문 안에 있는 i는 지역변수이므로 공통적으로 사용해도 무방 => for문 안에서만 사용하기 때문에 상관없음
		System.out.println("가족 성별");
		for (int i = 0; i < sex.length; i++) {
			System.out.print(sex[i]+ "\t ");
		}
		
		System.out.println("");
		System.out.println("아침식사 유무");
		for (int i = 0; i < morning.length; i++) {
			System.out.print(morning[i]+ "\t ");
		}
		
		System.out.println("");
		System.out.println("시력");
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i]+ "\t ");	
		}
		
		System.out.println("");
		System.out.println("가족 나이");
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i]+ "\t ");
			
		}
	}

}
