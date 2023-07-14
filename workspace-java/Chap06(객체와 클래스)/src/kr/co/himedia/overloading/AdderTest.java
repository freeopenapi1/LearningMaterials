package kr.co.himedia.overloading;

public class AdderTest {
	
	public static void main(String[] args) {
		Adder adder = new Adder();
		int iResult = adder.add(10, 50);
		System.out.println("iResult =" + iResult);
		
		long lResult = adder.add(100, 7500L);
		System.out.println("lResult =" + lResult);
		
		
	}

}
