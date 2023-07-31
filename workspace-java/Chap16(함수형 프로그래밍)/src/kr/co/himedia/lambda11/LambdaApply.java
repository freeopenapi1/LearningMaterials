package kr.co.himedia.lambda11;

public class LambdaApply {
	
	public static void main(String[] args) {
		
		// 람다 표현식으로 모든 문자를 대문자로 변환하는 StringOperation 구현하기
		StringOperation toUpper = s -> s.toUpperCase();
		
		// 람다 표현식으로 모든 문자를 소문자로 변환하는 StringOperation 구현하기
		StringOperation toLower = s -> s.toLowerCase();
		
		String input = "Lambda Expression";

		// 매개 변수로 전달되는 람다식
		System.out.println(opeartionString(input, toUpper));
		System.out.println(opeartionString(input, toLower));
		
		PrintString reStr = returnString();
		reStr.showString("Hello");
		
	}
	
	// 람다 표현식을 인자로 사용하는 메서드
	public static String opeartionString(String input, StringOperation operation) {
		return operation.apply(input);
	}
	
	public static PrintString returnString() {		//반환 값으로 사용
		return s -> System.out.println(s + " HiMedia");
	}

}






