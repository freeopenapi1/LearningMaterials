package kr.co.himedia.singleton02;

/*
 * serialNum 
 */

public class Car {
	private static int serialNum = 1000;
	private int carNum;
	
	public Car() {
		Car.serialNum++;
		carNum = serialNum;
	}

	public int getCarNum() {
		return carNum;
	}
	
}
