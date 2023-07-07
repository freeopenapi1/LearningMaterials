package kr.co.himedia.operator;

public class ArithmeticTest {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));	//나누기
		System.out.println("num1 % num2 = " + (num1 % num2));	//나머지
		
		
		int result;
		
		//예외 처리 코드
		
		
		try {
			result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("예외 발생 함 : " + e);
		}
		
		System.out.println("-----------");
		
	}
}




















