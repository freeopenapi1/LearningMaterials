package kr.co.himedia.object;

public class ObjectArgTest {

	public static void main(String[] args) {
		
		A a = new A();
		himedia(a);
		
		B b = new B();
		himedia(b);
		
	}
	
	public static void himedia(Object obj) {		//다형성 인수로 Object 타입 적용함
		if (obj instanceof A)
			((A)obj).printGo();
		else
			((B)obj).printGo();
	}
}

































