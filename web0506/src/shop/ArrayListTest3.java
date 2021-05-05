package shop;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListTest3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("하고 싶은 일 입력");
			list.add(data);
		}
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			String data2 = list.get(i);
			System.out.println(i + ": " + data2);
		}

	}

}
