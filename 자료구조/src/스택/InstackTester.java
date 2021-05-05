package 스택;

import java.util.Scanner;

import 스택.IntStack.EmptyInStackException;

public class InstackTester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dataSize = sc.nextInt();//스택 길이 설정
		
		IntStack stack = new IntStack(dataSize);
		
		while(true) {
			System.out.println("현재 데이터 수 : "+stack.ptr+stack.max);
			System.out.print("(1)푸시  (2)팝  (3)피크  (4)덤프  (0)종료 :");
			int menu = sc.nextInt();
			
			if(menu == 0)
				break;
			int data;
			switch (menu) {
			case 1:
				System.out.print("데이터: ");
				data = sc.nextInt();
				try {
					stack.push(data);
				} catch (IntStack.OverflowInStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					data = stack.pop();
					System.out.println("팝한 데이터는 "+data+"입니다");
				} catch (IntStack.EmptyInStackException e) {
					System.out.println("스택이 비어있습니다");
				}
				break;
			case 3:
				try {
					data = stack.peek();
				} catch (IntStack.EmptyInStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 4:
				try {
					stack.dump();
				} catch (IntStack.EmptyInStackException e) {
					// TODO: handle exception
					System.out.println("스택이 비어있습니다.");
				}
				break;

			default:
				break;
			}
		}
		
	}
}
