package shop;

import java.util.Date;

import javax.swing.JOptionPane;

public class 계산기2 {

	public int add(int x, int y) {
		//메서드 안에서 선언된 변수는 메서드 안에서만 사용가능
		//메서드 범위 지역안에서만 사용가능
		//지역변수(로컬변수) <--> 전역변수(글로벌변수)
		int result = x + y;
		System.out.println(result);
		JOptionPane.showMessageDialog(null, x +"+"+ y +" = " + result);
		return result;
	}
	public int minus(int x, int y) {
		int result = x - y;
		System.out.println(result);
		JOptionPane.showMessageDialog(null, x +"-"+ y +" = " + result);
		return result;
	}
	public int mul(int x, int y) {
		int result = x * y;
		System.out.println(result);
		JOptionPane.showMessageDialog(null, x +"*"+ y +" = " + result);
		return result;
	}
	public double div(int x, int y) {
		double result = (double)x / y;
		System.out.println(result);
		JOptionPane.showMessageDialog(null, x +"/"+ y +" = " + result);
		return result;
	}
}
