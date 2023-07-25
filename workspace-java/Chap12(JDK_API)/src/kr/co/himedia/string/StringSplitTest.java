package kr.co.himedia.string;

import java.util.Scanner;

/*
 * 문자열을 입력하세요 : 우리 나라 만 세
 * 
 * 우리
 * 나라
 * 만
 * 세
 */
public class StringSplitTest {

	public static void main(String[] args) {
		//String str = "Hello,World,Java";
		//String str = "Hello World Java";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = scanner.nextLine();
		
		String[] strArray = str.split("\\s");
		
		for (String s : strArray)
			System.out.println(s);
		
		scanner.close();
	}
}








