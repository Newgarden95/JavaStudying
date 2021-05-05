package database;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//ArrayList 사용하는 이유 : VO를 담을 컨테이너를 만들기 위해 사용 => 한화면에 보여줄 정보가 여러개인 경우 ex)ppt참조 JSP0506 취업반 50p
//100개 이상의 로우를 가져오려면 반드시 필요 하나의 VO를 새로운 컨테이너에 쌓아서 한 화면에 다 보여주기
//단순하게 테이블셋에서 1개의 로우만 얻어오려면 사용할 필요 없지만 많이 가져올 경우에는 반드시 가방을 담을 커다란 컨테이너가 필요해
public class ArrayListTest1 {
	public static void main(String[] args) {
		/*
		 * ArrayList list = new ArrayList(); //ArrayList는 다양한 자료형을 넣어도됨 + 유동적 크기의 리스트를
		 * 만들어야 할 경우 이거 사용 list.add("홍길동"); //배열리스트에 넣기 list.add(100); list.add(11.11);
		 * System.out.println(list.get(0)); //1번째 인덱스에 해당하는 값 출력
		 * System.out.println(list.size());
		 * 
		 * for (int i = 0; i < list.size(); i++) { System.out.println(i +
		 * ":"+list.get(i)); }
		 */

		/*
		 * package database;
		 * 
		 * import java.util.ArrayList;
		 * 
		 * import javax.swing.JOptionPane;
		 * 
		 * public class ArrayListTest3 {
		 * 
		 * public static void main(String[] args) { ArrayList<String> list = new
		 * ArrayList<>(); for (int i = 0; i < 3; i++) { String data =
		 * JOptionPane.showInputDialog("하고 싶은 일 입력"); list.add(data); }
		 * System.out.println(list.size()); for (int i = 0; i < list.size(); i++) {
		 * System.out.println(i + ": " + list.get(i)); }
		 * 
		 * }
		 * 
		 * }
		 */
		ArrayList<String> list = new ArrayList<String>();
		while (true) {
			String a = JOptionPane.showInputDialog("수료후 하고싶은 것은? (X입력시 종료)");
			if (a == "X") {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				list.add(a);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println("수료후 하고 싶은 것은" + list.get(i) + " 입니다.");
		}

	}
}
