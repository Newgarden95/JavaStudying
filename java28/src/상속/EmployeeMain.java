package 상속;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager ma = new Manager();
		
		employee.address= "서울시";
		employee.name = "홍길동";
		employee.salary = 3000000;
		//employee.rrn = 950313; //private이기 때문에 참조불가
		
		ma.address = "서울시";
		ma.name = "김길동";
		//ma.rrn = 930417;
		ma.salary = 4000000;
		ma.test();
		
		System.out.println(employee);
		
		
	}

	
	
	
}
