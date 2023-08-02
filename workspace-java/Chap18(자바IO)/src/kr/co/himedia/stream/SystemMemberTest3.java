package kr.co.himedia.stream;

import java.io.IOException;
import java.io.InputStreamReader;

/*
 *    가나다
 *    가나다
 *    
 *    안녕하세요
 *    안녕하세요
 *    
 *    ...
 *    
 *    
 *    끝
 *    
 *    
 *     */
public class SystemMemberTest3 {

	public static void main(String[] args) {
		System.out.println("문자 입력 후 '끝'이라고 쓰세요.");
		
		int i;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i = isr.read()) != '끝') {
				System.out.print((char)i);				
			}

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}














