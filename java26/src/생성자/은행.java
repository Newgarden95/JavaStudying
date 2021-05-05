package 생성자;

public class 은행 {
	public static void main(String[] args) {
		계좌 acc = new 계좌("홍길동","적금통장",150000);
		계좌 acc1 = new 계좌("김길동","예금통장",300000);
		계좌 acc2 = new 계좌("신길동","입출금통장",2000000);
		System.out.println(acc);
		System.out.println(acc1);
		System.out.println(acc2);
		
	}
}
