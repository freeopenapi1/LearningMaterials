package kr.co.himedia.stream02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		int even = 0;
		for (int num : numbers) {
			if (num % 2 == 0) {
				even += num;
			}
		}
		
		System.out.println("even = " + even);
		System.out.println();
		
		IntStream stream = Arrays.stream(numbers);
		
		int sumofEven = Arrays.stream(numbers)
						.filter(n -> n%2 == 0)
						.sum();
		System.out.println("sumofEven = " + sumofEven);
		System.out.println();	
		
		
		// even = 2
		// even = 4
		Arrays.stream(numbers).filter(n -> n%2 ==0).forEach(s -> System.out.println("even = " + s));
		System.out.println();	
		
		
		int[] evenNumbers = Arrays.stream(numbers)
					.filter(n->n%2==0)
					.toArray();
		for(int even0 : evenNumbers)
			System.out.println("even = " + even0);
		
	}
}













































