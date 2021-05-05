package 리뷰문제07082;

public class 방송국 {
	String type; // 방송사
	int channel;//채널
	
	//생성자
	public 방송국(String type, int channel) {
		super();
		this.type = type;
		this.channel = channel;
	}
	public void info() {
		System.out.println("안녕하세요. "+type+"방송국입니다. 저희 채널은 "+channel+"번입니다.");
	}
	@Override
	public String toString() {
		return "방송국 [type=" + type + ", channel=" + channel + "]";
	}
}
