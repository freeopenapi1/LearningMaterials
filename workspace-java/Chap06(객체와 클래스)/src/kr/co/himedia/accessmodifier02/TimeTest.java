package kr.co.himedia.accessmodifier02;

public class TimeTest {

	public static void main(String[] args) {
		
		Time time = new Time();
		//time.setHour(-20);
		time.setHour(16);
		time.setMinute(38);
		time.setSecond(34);
		
		time.setHour(50);
		time.setMinute(100);
		time.setSecond(100);
		
		System.out.println(time);
	}
}
