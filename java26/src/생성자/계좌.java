package 생성자;

public class 계좌 {
	String name;
	String field;
	int money;
	
	//반드시 이름 계좌 돈을 받아야 하므로 기본 생성자 사용 ~> new 계좌(); 사용 불가
	public 계좌(String name, String field, int money) {
		super();
		this.name = name;
		this.field = field;
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "계좌 [name=" + name + ", field=" + field + ", money=" + money + "]";
	}

	
}
