package kr.co.himedia.operator02;

import java.util.Scanner;

/*
 * 	입력 받은 두 수 중에서 큰 수를 출력하시오.
 * 
 *  입력1 : 
 *  입력2 : 
 *  
 *  100
 */
public class ConditionTest03 {

	public static void main(String[] args) {
		System.out.println("입력 받은 두 수 중에서 큰 수를 출력하시오.");
		
		Scanner scanner = new Scanner(System.in);
		int max;
		
		System.out.print("입력1 : ");
		int x = scanner.nextInt();
		System.out.print("입력2 : ");
		int y = scanner.nextInt();	
		
		max = (x > y) ? x : y;
		System.out.println(max);
				
		
		scanner.close();
	}
}



























