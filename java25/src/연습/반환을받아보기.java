package 연습;

import java.util.Date;

public class 반환을받아보기 {
	public static void main(String[] args) {
		반환값연습 re = new 반환값연습();
		re.add2();
		
		//ctrl + 클릭 => 원본 메서드 확인 가능
		int sum1 = re.add(200, 100);
		System.out.println(sum1);
		
		double sum2 = re.add(33.3, sum1);
		System.out.println(sum2);
		
		String sum3 = re.add("다음 시간은", "점심시간");
		System.out.println(sum3);
		
		String sum4 = re.add(100,"은 나의 백넘버");
		System.out.println(sum4);
		
		int[] sum5 = re.add();
		for(int x: sum5) {
			System.out.println(x);
		}
		
		Date d = re.getDate();
		System.out.println(d);
	}
}
