package kr.co.himedia.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		Arrays.stream(arr).forEach(n -> System.out.print(n +"\t"));
		System.out.println();
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.println(n));
		System.out.println();
		
		int sum = Arrays.stream(arr).sum();
		System.out.println("sum : " + sum);
		
		long count = Arrays.stream(arr).count();
		System.out.println("count : " + count);
		
	}

}












