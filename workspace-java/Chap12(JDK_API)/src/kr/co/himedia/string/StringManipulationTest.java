package kr.co.himedia.string;

public class StringManipulationTest {

	public static void main(String[] args) {
		
		String str = "HelloWorld";
		System.out.println(str.charAt(1));
		System.out.println(str.replaceAll("o", "X"));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 8));
		System.out.println(str.indexOf("Wr"));		//5, -1
		
	}
}
