package kr.co.himedia.operator02;

public class BitOperTest {

	public static void main(String[] args) {
		
		int num1 = 5;				// 0000 0101
		int num2 = 10;				// 0000 1010
		
		System.out.println(~num1);	// 1111 1010
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);	// 0000 1111
		System.out.println(num1 ^ num2);
		
		System.out.println(num1 << 2);		// 0001 0100
		System.out.println(num1);
		System.out.println(num1 <<= 2);		// num1 = num1 << 2
	}
}
