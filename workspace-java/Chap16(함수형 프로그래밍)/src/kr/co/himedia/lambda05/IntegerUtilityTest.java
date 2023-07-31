package kr.co.himedia.lambda05;

public class IntegerUtilityTest {

	public static void main(String[] args) {
		
		//정적메서드 참조 
		Converter<String, Integer> converter = IntegerUtility::stringToInt;
		int result = converter.convert("123");
		System.out.println("result = " + result);

	}

}
