package 생성자;

public class Day {
	
String doing;
int time;
String place;

//Day 생성자
public Day(String doing, int time, String place) {
	this.doing = doing;
	this.time = time;
	this.place = place;
}

@Override
public String toString() {
	return "일과 [doing=" + doing + ", time=" + time + ", place=" + place + "]";
}

}
