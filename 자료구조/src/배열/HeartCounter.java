package 배열;
//https://velog.io/@lshjh4848/static%EB%B3%80%EC%88%98%EC%99%80-static-%EB%A9%94%EC%84%9C%EB%93%9C-final-xpk2l8e7g0
public class HeartCounter{
	 	//int count;
	    static int count;

	    public HeartCounter() {//생성자
	        this.count ++;
	        System.out.println("좋아요 갯수 : " + this.count);
	    }

	    public static void main(String[] args) {
	        HeartCounter hc1 = new HeartCounter();
	        HeartCounter hc2 = new HeartCounter();
	    }
}
