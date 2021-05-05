package 리뷰문제07082;

public class 프로그램 extends 방송국 {
	
	String title; //프로그램 제목
	String genre; //프로그램 장르
	public 프로그램(String type, int channel, String title, String genre) {
		super(type, channel);
		this.title = title;
		this.genre = genre;
	}
	public void program() {
		System.out.println("선택하신 체널은 "+type+"방송사의 "+genre+"장르인 "+title+"입니다.");
	}
	@Override
	public String toString() {
		return "프로그램 [title=" + title + ", genre=" + genre + "]";
	}
}
