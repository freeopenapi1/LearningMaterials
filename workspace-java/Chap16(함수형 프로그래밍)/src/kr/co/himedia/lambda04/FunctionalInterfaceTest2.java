package kr.co.himedia.lambda04;

public class FunctionalInterfaceTest2 {

	public static void main(String[] args) {
		
		MathOperation mo = new MathOperationImpl();
		int result = mo.operation(200, 100);
		
		System.out.println("result = " + result);
		
	}
}
