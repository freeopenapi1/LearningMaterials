package kr.co.himedia.review;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 	생성할 배열의 length : 3 
 *  배열 요소 입력 : 2 3 4 
 *  sum = 9
 *  [2, 3, 4]
 */
public class ArrayTest02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생성할 배열의 length : ");
		int num = sc.nextInt();
		
		System.out.print("배열 요소 입력 : ");
		sc.nextLine();
		
		int[] arr = new int[num];			// 배열의 생성
		for (int i = 0; i < num; i++)
			arr[i] = sc.nextInt();			// 배열의 저장 
		
		long sum = 0;
		for (int i = 0; i < num; i++)
			sum += arr[i];
					
		System.out.println("sum = " + sum);
		System.out.println(Arrays.toString(arr));
	
		sc.close();

	}

}


























