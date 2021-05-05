package shop;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add(11.11);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.size());
		list.remove(0);
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}

	}

}
