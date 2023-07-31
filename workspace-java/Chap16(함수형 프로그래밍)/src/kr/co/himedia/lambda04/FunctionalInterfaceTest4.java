package kr.co.himedia.lambda04;

public class FunctionalInterfaceTest4 {
	
	public static void main(String[] args) {
		
		MathOperation add = (int x, int y) -> {return x + y;};
		
		int result = add.operation(100, 200);
		System.out.println("result = " + result);
	}

}
