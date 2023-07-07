package kr.co.variable;

/*
 */

public class VariableTest {

	public static void main(String[] args) {
		
		int age, count;
		age = 10; 
		
		int level = 10000;
		
		System.out.println(age);
		System.out.println(level);
		//System.out.println(count);		// 에러 - 지역변수는 반드시 초기화 되어야 함 	
		System.out.println(age + level);
	}
}
