package 예외처리;

public class 에러발생 {
	
	public void call() {//에러메소드
		
		//System.out.println(3/0); 이 부분 블록처리해서 source -> surroundwith -> try catch
		try {
			System.out.println(3/0);
		} catch (Exception e) {
			System.out.println("에러 발생함."+e.getMessage());
			e.printStackTrace();
			
		}
	}
	
}
