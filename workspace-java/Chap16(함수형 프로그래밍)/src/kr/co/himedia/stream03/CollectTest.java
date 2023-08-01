package kr.co.himedia.stream03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//정수 리스트에서 각 원소를 제곱한 값을 출력하시오.
public class CollectTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		// 스트림의 각 원소를 제곱한 값을 구성된 새로운 리스트 생성
		List<Integer> squaredNums = numbers.stream()
									.map(n -> n*n)
									.collect(Collectors.toList());
		System.out.println("정수 리스트에서 각 원소를 제곱한 값 : " + squaredNums);
	}
}
