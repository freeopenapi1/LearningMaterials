package kr.co.himedia.accessmodifier02;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	//getter()
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		//예외처리 코드 
		if(hour < 0 || hour > 23) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;
		}
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		//분에 대한 예외처리 코드
		if(minute < 0 || minute > 59) {
			System.out.println("분을 잘못 입력하셨습니다.");
			return;
		}
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		//초에 대한 예외처리 코드
		if(second < 0 || second > 59) {
			System.out.println("초를 잘못 입력하셨습니다.");
			return;
		}		
		this.second = second;
	}

	@Override
	public String toString() {
		return this.getHour() +"시 "+
				this.getMinute() +"분 "+
				this.getSecond() +"초 입니다.";
	}
	
	

}















