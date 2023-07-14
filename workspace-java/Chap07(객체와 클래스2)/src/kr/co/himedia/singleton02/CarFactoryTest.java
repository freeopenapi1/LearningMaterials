package kr.co.himedia.singleton02;

/*
 *  자동차공장이 있다.
 *  자동차공장이 유일한 객체이고, 이 공장에서 생산되는 자동차는 
 *  생상될때마다 고유의 차번호가 부여된다.
 *  
 *  자동차 번호가 1001번부터 시작되어 차가 생산되게 구현하시오.
 *  자동차공장 클래스는 싱글톤 패턴을 적용하여 구현하시오.
 *  
 *  출력예시
 * 		1001
 * 		1002 	
 */
public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory carFactory = CarFactory.getInstance();
		Car BMW_M760Li = carFactory.createCar();
		Car BMW_iX_M60 = carFactory.createCar();
		
		System.out.println(BMW_M760Li.getCarNum());
		System.out.println(BMW_iX_M60.getCarNum());
	}
}


























