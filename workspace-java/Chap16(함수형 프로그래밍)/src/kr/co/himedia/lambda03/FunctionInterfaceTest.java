package kr.co.himedia.lambda03;

import java.util.function.Function;

public class FunctionInterfaceTest {

	public static void main(String[] args) {
		Function<Integer, Integer> myAdder = x -> x + 10;
		int result = myAdder.apply(100);
		System.out.println(result);
	}
}
