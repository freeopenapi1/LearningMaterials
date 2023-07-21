package kr.co.himedia.interface01;

public class CompleteCalculatorTest {

	public static void main(String[] args) {
		
		Calc calc = new CompleteCalculator();
		
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
	}
}
