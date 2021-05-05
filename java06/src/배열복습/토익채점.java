package 배열복습;

import java.util.Random;

public class 토익채점 {

	public static void main(String[] args) {
		// 문제 990답안과 내답이 필요
		Random r = new Random(42);
		int[] cor = new int[990];
		int[] my_cor = new int[990];
		//1부터 4까지 990문제에 넣기
		
		for (int i = 0; i < my_cor.length; i++) {
			cor[i] = r.nextInt(4)+1; //답안에 1~4까지 임의의 숫자 대입
			my_cor[i] = r.nextInt(4)+1; //내 답안에 1~4까지 임의의 숫자 대입
			
		}
		//프린트
		for (int i = 0; i < my_cor.length; i++) {
			System.out.println(+i+"번 문제 정답"+cor[i]+" <-> 내답 "+my_cor[i]);
		}
		int count = 0;
		for (int i = 0; i < my_cor.length; i++) {
			if (cor[i] == my_cor[i]) { //정답과 내 답이 일치하는 것 카운트
				count++;
			}
		}
		System.out.println("===============================");
		System.out.println("내가 맞춘 갯수는 "+count+"개 입니다.");
		System.out.println("총 점수는 "+(count*1)+"점 입니다.");
	}

}
