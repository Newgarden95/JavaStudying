package 컬렉션;

import java.util.HashSet;

public class 연습문제 {
	
/*
 * 팀을 구성하려고 합니다.
 * 한 명씩만 필요하고, 디자이너, 프로그래머, DB관리자 => 중복x 
 * 팀원 목록을 프린트하시오
 * */
	public static void main(String[] args) {
		HashSet set = new HashSet(); //중복없이 자료를 저장해야함 -> set
		set.add("디자이너"); //자료들을 저장해준다
		set.add("프로그래머");
		set.add("DB관리자");
		
		System.out.println(set); //출력
	}
}
