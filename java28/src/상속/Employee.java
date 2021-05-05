package 상속;

public class Employee {
	
    public String name;
	String address;//다른 패키지에서 사용불가/ 같은 패키지에서만 사용가능 (default)
	protected int salary;
	private int rrn;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
	
}
