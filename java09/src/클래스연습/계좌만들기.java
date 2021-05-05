package 클래스연습;

public class 계좌만들기 {
	public static void main(String[] args) {
		계좌 계좌1 = new 계좌();
		계좌 계좌2 = new 계좌();
		
		//계좌1.member();
		//계좌1.deposit();
		
		계좌1.account = "튼튼적금" ;
		계좌1.money = 1000;
		계좌1.name = "홍길동";
		계좌1.deposit(5000);
		계좌1.withdraw(2000);
		
		계좌2.account = "튼튼예금" ;
		계좌2.money = 2000;
		계좌2.name = "박길동";
		계좌2.deposit(6000);
		계좌2.withdraw(2000);
		
	}
}
