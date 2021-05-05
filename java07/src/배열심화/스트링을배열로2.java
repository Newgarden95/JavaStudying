package 배열심화;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		//1. String[]로 바꾸어보세여. 
		//2. 바꾸었더니  공백이 포함되어있다면, 공백을 모두 제거 후 , 다시 배열에 넣으세요.
		//3. 과목수는?
		//4. 컴퓨터의 위치는?
		//5. 모든 과목의 글자수는?
		//6. 세글자 미만의 과목수는?
		
		//1
		String[] s = all.split(",");
		//2
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			s[i] = s[i].trim();
		}
		System.out.println(s[1]);
		//3
		System.out.println("과목수: "+s.length+"개");
		//4
		for (int i = 0; i < s.length; i++) {
			if(s[i].equals("컴퓨터")) {
				System.out.println("컴퓨터의 위치는 "+(i+1)+"번째");
			}
		}
		//5
		int sum = 0;
		for(String x : s) {
			sum += x.length();
		}
		System.out.println("모든 글자수는 "+sum+"개 입니다.");
		//6 
		int count = 0;
		for(String x : s) {
			if(x.length()<3) {
				count++;
			}
		}
		System.out.println("세 글자 미만의 과목은" + count + "개입니다.");
				
		System.out.println("========================================");
		String s1 = "나는 프로그래머야";
		String s2 = "진짜!!";
		System.out.println(s1+s2);//스트링 결합
		System.out.println(s1.concat(s2));//스트링 결합(두 문장을 연결)
		System.out.println(s1.charAt(0)); //0번째 문자(문자 한글자 추출)
		System.out.println(s1.endsWith("야"));// 특정한 문자로 끝나는지
		System.out.println(s1.substring(3)); //인덱스 3이후 글자들 모두 추출
		System.out.println(s1.substring(3, 8)); //인덱스 3~7까지 추출
		System.out.println(s1.contains(s2)); //s1에 s2가 포함되어있는지
		System.out.println(s1.lastIndexOf("프"));//s1중 "프" 글자위치 서버에서 Url 가져올때 사용 
												//ex) www.naver.com/web1/member.html이면 우리가 member.html을 어떻게 가져올까?
												// lastIndexOf("/")를 사용해서 제일 마지막에 해당하는 인덱스를 얻은 후 substring(얻은 인덱스) 사용하여 주소를 얻을 수 있음
		System.out.println(s1.toUpperCase());//대문자로 변경
		System.out.println(s1.toLowerCase());//대문자로 변경
		System.out.println(s.length);//글자수
		System.out.println(s1.replace("나", "너"));//변경
	}
}
