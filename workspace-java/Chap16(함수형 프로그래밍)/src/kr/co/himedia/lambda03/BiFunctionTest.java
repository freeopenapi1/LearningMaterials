package kr.co.himedia.lambda03;

import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
		int result = add.apply(100, 200);
		System.out.println("result = " + result);
	}
}
