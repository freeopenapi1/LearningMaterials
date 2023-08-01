package kr.co.himedia.stream02;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ReduceTest {

	public static void main(String[] args) {
		
		String[] chenho = {"현대백화점 천호점!!!", "E-mart", "Hi HiMedia", "청년주상복합건물"};
		
		System.out.println(Arrays.stream(chenho).reduce("", (s1,s2)->
							{
								if(s1.getBytes().length >= s2.getBytes().length)
									return s1;
								else
									return s2;
							}
				));
		
		System.out.println();
		
		String str = Arrays.stream(chenho).reduce(new CompareString()).get();
		System.out.println(str);
		
	}
}



class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s1;
	}
	
}




















