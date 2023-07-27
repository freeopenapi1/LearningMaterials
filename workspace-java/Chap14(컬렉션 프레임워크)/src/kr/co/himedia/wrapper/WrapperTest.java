package kr.co.himedia.wrapper;

public class WrapperTest {
	
	public static void main(String[] args) {
		
		int a = 10;			//기본 자료형
		Integer aa = a;		//new Integer(10);	auto-boxing
		System.out.println(aa.intValue());		//auto-unboxing (Integer=>int)
		
		Integer bb = 20;	//auto-boxing
		int b = bb;  		//auto-unboxing 
		
		float f = 10.5f;
		Float ff = 45.6f;	//auto-boxing
		
		
	}

}
