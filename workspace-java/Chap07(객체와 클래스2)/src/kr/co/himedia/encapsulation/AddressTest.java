package kr.co.himedia.encapsulation;

public class AddressTest {
	
	public static void main(String[] args) {
		
		DisplayAddress displayAddress = new DisplayAddress();
		String sBuffer = displayAddress.getAddress();
		
		System.out.println(sBuffer);
	}

}
