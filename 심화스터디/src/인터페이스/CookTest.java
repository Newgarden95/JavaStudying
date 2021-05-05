package 인터페이스;

public class CookTest {
	public static void main(String[] args) {
		//인터페이스를 implement한 클래스라서 객체생성이 가능
		//다형성활용
		Icook cook = new KoreanCook(); 
		
		((KoreanCook)cook).makeRice();
		((KoreanCook)cook).makeSalad();
		((KoreanCook)cook).makeSoup();
		((KoreanCook)cook).makeSource();
		
		cook = new ChineseCook();
		
		((ChineseCook)cook).makeRice();
		((ChineseCook)cook).makeSalad();
		((ChineseCook)cook).makeSoup();
		((ChineseCook)cook).makeSource();
		
		Icook icook = null;
		CookManger CM = new CookManger(icook);
		CM.SetIcook(icook);
		CM.orderRice();
		CM.orderSoup();
	}
}
