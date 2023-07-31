package kr.co.himedia.lambda07;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("이순신", "류성룡", "권율");
		Collections.sort(names, String::compareTo);
		System.out.println(names);
		
		for (String name : names)
			System.out.println(name);
		
	}

}





























