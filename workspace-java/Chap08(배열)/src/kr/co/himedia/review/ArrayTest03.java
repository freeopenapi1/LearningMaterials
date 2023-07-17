package kr.co.himedia.review;

import java.util.Arrays;

public class ArrayTest03 {

	static int[] arr = {2023, 7, 17, 2023, 11, 28, 22, -21, 5, 6};
	
	public static void main(String[] args) {
		System.out.println(ArrayTest03.get(arr, 2));
		ArrayTest03.changeElement(arr, 0, 2024);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int get(int[] arr, int idx) {
		return arr[idx];
	}
	
	public static void changeElement(int[] arr, int idx, int val) {
		arr[idx] = val;
	}
	
}
