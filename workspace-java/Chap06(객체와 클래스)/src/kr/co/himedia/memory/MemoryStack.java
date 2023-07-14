package kr.co.himedia.memory;

public class MemoryStack {
	
	public static int add(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		int result = add(number1, number2);
		System.out.println("result : ===========" + result);
	}
}
