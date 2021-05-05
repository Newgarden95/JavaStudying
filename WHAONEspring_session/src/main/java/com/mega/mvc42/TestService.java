package com.mega.mvc42;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class TestService {
	public int text(String tel) {
	      //랜덤한 값 6자리 만들어 controller에게 리턴
	      Random   r = new Random();
	      int num2 = r.nextInt(900000) + 100000;//100000~999999
	      return num2;
	   }
	
	public String title(String title) {
		return title;
	}
	
	public String cost(String cost) {
		return cost;
	}
}
