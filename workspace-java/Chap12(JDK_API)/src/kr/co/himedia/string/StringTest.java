package kr.co.himedia.string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("himedia");
		String str2 = new String("himedia");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "himedia";
		String str4 = "himedia";
		
		System.out.println(str3 == str4);		//주소값 비교
		System.out.println(str3.equals(str4));
		
		System.out.println(str1.equals(str3));
		
		System.out.println();
		
		String str5 = "apple";
		String str6 = "banana";
		int result = str5.compareTo(str6);		// 0, 음수, 양수 
		if (result == 0)
			System.out.println("str5==str6");
		else if (result < 0) 
			System.out.println("str5 < str6");
		else 
			System.out.println("str5 > str6");
		
	}
}











