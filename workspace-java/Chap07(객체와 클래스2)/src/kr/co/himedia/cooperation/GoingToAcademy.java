package kr.co.himedia.cooperation;

public class GoingToAcademy {

	public static void main(String[] args) {
		
		Student studentLee = new Student("이순신", 10000);
		Student studentShin = new Student("신사임당", 50000);
		
		Bus bus124 = new Bus(124);
		Subway subway8 = new Subway(8);
		
		studentLee.takeBus(bus124);
		studentLee.takeBus(bus124);
		studentShin.takeSubway(subway8);
		studentShin.takeSubway(subway8);
		
		studentLee.showInfo();
		studentShin.showInfo();
		
		bus124.showInfo();
		subway8.showInfo();
	}
}
