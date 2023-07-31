package kr.co.himedia.lambda10;

public class LambdaTest {

	public static void main(String[] args) {
		
		//익명 내부 클래스 사용
		MathOperation add = new MathOperation() {
			
			@Override
			public int operation(int x, int y) {
				
				return x + y;
			}
		};
		
		int result = add.operation(100, 200);
		System.out.println("result = " + result);
		
		//람다식 사용
		MathOperation add2 = (x, y) -> x + y;
		int result2 = add2.operation(200, 400);
		System.out.println("result2 = " + result2);
		
		//람다식 사용 *
		MathOperation add3 = (x, y) -> x * y;
		int result3 = add3.operation(200, 400);
		System.out.println("result3 = " + result3);
		
	}
}









