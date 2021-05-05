package 상속;

public class 영화에출연 {

	public static void main(String[] args) {
		슈퍼맨 sman = new 슈퍼맨();
		sman.name = "클라크";
		sman.age = 30000;
		sman.speed = 1000;
		sman.fly = true;
		
		sman.먹다();
		sman.달리다();
		sman.우주를날다();
		
		System.out.println(sman);
		
		원더우먼 ww = new 원더우먼();
		ww.name = "린다카터";
		ww.age = 10000;
		ww.sense = true;
		ww.power = 30000;
		
		ww.먹다();
		ww.악당을물리치다();
		ww.요리하다();
		
		System.out.println(ww);
	}
}
