package kr.co.himedia.templatemethod;

public class CarTest {

	public static void main(String[] args) {
		
		Car gaiCar = new GenerativeAICar();
		gaiCar.run();
		
		System.out.println();
		
		Car manualCar = new ManualCar();
		manualCar.run();
	}
}
