package kr.co.himedia.stream03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 스트림의 문자열 원소를 대문자로 변환하시오.
public class CollectTest2 {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple", "banana", "cherry", "orange");
		
		//스트림의 각 원소를 대문자로 변환한 새로운 리스트 생성
		List<String> uppercase = fruits.stream()
									.map(word -> word.toUpperCase())
									.collect(Collectors.toList());
		System.out.println("스트림의 문자열 원소를 대문자로 변환 : " + uppercase);
		
		for (String str : uppercase)
			System.out.println(str);

	}

}


























