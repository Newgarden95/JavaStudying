package 상속;
//맨을 상속받아 사용
public class 슈퍼맨 extends 맨{
//멤버변수3개, 멤버메서드2개 갖고 태어남
	boolean fly;
	public void 우주를날다() {
		System.out.println("이름이 "+name+"인 슈퍼맨이 우주를 날아간다."); //상속받으면 다 자기꺼
	}
	@Override
	public String toString() {
		return "슈퍼맨 [fly=" + fly + ", speed=" + speed + ", name=" + name + ", age=" + age + "]"; //상속받은 영역까지 다 오버라이드
	}
	
	
}
