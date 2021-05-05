package 배열심화;

import java.util.Random;

public class 최대값찾기 {

	public static void main(String[] args) {
		// 타입이 동일한 많은 양의 데이터가 있으면 배열에 넣으세요.
		// 반복을 통해서 많은 양의 데이터를 효율적으로 다룰 수 있음.
		//int[] num = {11, 33, 55, 22, 44};
		//데이터 내부에 있는 데이터 2개를 비교하여 큰거를 하나의 변수에 대입 이걸 계속해서 => CPU + RAM 사용량 많아서 사실상 별로 좋지 않은 방법임
		//좋은방법 : 하나의 변수에 for을 돌렸을때 마다 그 값을 변수에 넣어서 확인하기
		int[] num = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		
		int max = num[0]; //초기화할 때 0이 아닌 num[0]을 넣는 이유: 만약 배열이 음수로만 구성된 경우 0은 데이터에 저장된게 아닌데 최대값이 되기때문에 불필요함
		
		for (int i = 0; i < num.length; i++) {
			if (max<num[i]) {
				max = num[i];
			}
		}
		System.out.println("최대값은 "+max+"입니다.");
		for(int x : num) {
			if(max<x) {
				max = x;
			}
		}
		System.out.println("최대값은 "+max+"입니다.");
		
		
		//최대값을 갖는 거 갯수
		//최대값을 갖는 인덱스
		//배열은 ###고정크기###일때 효율적임 => 최대값을 갖는 인덱스를 배열에 넣는건 무리 왜why? 인덱스가 몇개인지 모르잖아.
		int max_count = 0;
		String sum = ""; //최대값의 인덱스를 문자열로 붙여주기 위해 생성
		
		for (int i = 0; i < num.length; i++) {
			if( num[i] == max) {
				max_count++;
				System.out.println("인덱스 번호"+i+" ");
				sum = sum + i + " ";// 문자열로 저장됨
			}
		}
		System.out.println("최대값을 갖는 개수"+max_count);
		System.out.println(sum);
		String[] s = sum.split(" "); //split은 String 배열을 만들어 준다. 현재는 공백을 통해 나누기
		System.out.println(s[0]);
		System.out.println(s[1]);
			}
}
