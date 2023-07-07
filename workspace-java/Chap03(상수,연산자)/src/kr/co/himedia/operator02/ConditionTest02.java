package kr.co.himedia.operator02;

public class ConditionTest02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//최소값
		int min = (a < b) ? a : b;
		System.out.println("최소값 : " + min);
		
		//최대값
		int max = (a > b) ? a : b;
		System.out.println("최대값 : " + max);
	}
}
