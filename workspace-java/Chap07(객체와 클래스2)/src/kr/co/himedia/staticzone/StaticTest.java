package kr.co.himedia.staticzone;

public class StaticTest {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int result = StaticTest.sum(a,b);
		Math.abs(10.0);
		System.out.println("sum = " + result);
	}
	
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

}
