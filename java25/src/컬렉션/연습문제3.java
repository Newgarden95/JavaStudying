package 컬렉션;

import java.util.ArrayList;

public class 연습문제3 {
/*
 * 시험일정 순서가 국어, 수학 , 영어, 컴퓨터 => 순서가 있다.
 * 시험일정을 담은 컬렉션을 만드세요.
 * 시험을 보면 한과목씩 사라지게 해주세요.
 * 전체 시험 볼 과목: [국어, 수학, 영어, 컴퓨터]
 * 1일차 시험 후 남은 과목: [수학, 영어, 컴퓨터]
 * 2일차 시험 후 남은 과목: [영어, 컴퓨터]
 * 3일차 시험 후 남은 과목: [컴퓨터]
 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //시험순서가 있기 때문에 ArrayList 선언
		list.add("국어");
		list.add("수학");
		list.add("영어");
		list.add("컴퓨터");
		
		System.out.println(list.size());
		int size = list.size(); //size에 리스트 길이로 초기값 고정
		
		System.out.println("전체 시험 볼 과목: "+list);//시험 과목 확인
		
		for (int i = 0; i <size-1; i++) { // 범위를 list.size()로 하면 for문안에 remove가 수행할 때 마다 리스트 길이가 줄어들어서 안됨
			list.remove(0); //한 과목씩 삭제
			System.out.println((i+1)+"일차 시험 후 남은 과목: "+list);
		}
	}
}
