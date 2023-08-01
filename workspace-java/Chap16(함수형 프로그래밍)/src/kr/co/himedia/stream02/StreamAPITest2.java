package kr.co.himedia.stream02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPITest2 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Predicate<Integer> isEven = n -> n%2 == 0;
		
		int sumofnumbers = numbers.stream()
							.filter(isEven)
							.sorted()
							.map(n -> n*n)
							.reduce(0, Integer::sum);
		System.out.println("1~10사이의 짝수의 제곱의 합 : " + sumofnumbers);
	}
}
