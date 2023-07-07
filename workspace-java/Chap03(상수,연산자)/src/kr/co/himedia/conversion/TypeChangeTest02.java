package kr.co.himedia.conversion;

public class TypeChangeTest02 {

	public static void main(String[] args) {
		byte num1 = 1;
		byte num2 = 2; 
		//byte num3 = num1 + num2;		//int보다 작은 정수형은 int 타입으로 자동 형변환 발생.
		byte result1 = (byte)(num1 + num2);		//강제 형변환 
		
		int num3 = 1;
		int num4 = 2;
		int result2 = num3 + num4;
		
		long num5 = 1;
		long num6 = 2;
		long result3 = num3 + num4;				//자동 형변환
		
		float num7 = 1.0f;
		float num8 = 2.0f;
		
		double num9 = 1.0;
		double num10 = 2.0;
		double result4 = num7 + num8;			//자동 형변환
	}
}























