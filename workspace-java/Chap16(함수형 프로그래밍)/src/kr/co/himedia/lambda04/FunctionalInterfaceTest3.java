package kr.co.himedia.lambda04;

public class FunctionalInterfaceTest3 {

	public static void main(String[] args) {
		
		// MathOperation 인터페이스를 익명(anonymous) 내부 클래스로 구현함
		MathOperation mo = new MathOperation() {
			
			@Override
			public int operation(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		};
		
		int result = mo.operation(100, 200);
		System.out.println("result = " + result);
	}
}
