import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");
		String text = sc.next();
		
		int counta = 0;
		int countb = 0;
		int countc = 0;
		
		char[] arr = text.toCharArray();
		String a = arr.toString();
		System.out.println(a);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 'a') {
				counta++;
			}
			else if(arr[i] == 'b') {
				countb++;
			}
			else if(arr[i] == 'c') {
				countc++;
			}
		}
		System.out.println("conuntA : "+counta+"개 conuntA : "+countb+"개 conuntA : "+countc+"개");
	}
}
