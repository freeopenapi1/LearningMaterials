package kr.co.himedia.lambda12;

public class TriFunctionTest {
	
	public static void main(String[] args) {
		
		TriFunction<Integer, Integer, Integer, Integer> addTriNums =
				(x, y, z) -> x + y + z;
        int result = addTriNums.apply(3, 2, 5);
        System.out.println("result : " + result);
	}

}
