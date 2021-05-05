package 배열심화;

public class 스트링을배열로 {
// 스트링은 매우 중요하니까!!! 
	public static void main(String[] args) {
		String s = "감자,고구마,양파";
		String[] s2 = s.split(",");//문장 끊어서 배열로 만들기: split()
		//음식의 개수는 몇개일까요?
		System.out.println(s2.length+"개");
		
		String s3 = "     홍길동";
		String s4 = s3.trim(); //공백제거: trim()
		System.out.println(s4.length());
		
		String s5 = s3.replace("     ",	 ""); //대체하기: replace()
		System.out.println(s5);
		String s6 = "홍길동";
		char[] s7 = s6.toCharArray();
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);
	}

}
