package kr.co.himedia.decisionIf;

import java.util.Scanner;

public class IfElseTest02 {
	
	static final String ADMIN_ID = "admin";
	static final String ADMIN_PASSWORD = "1128";

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID : ");
		String id = scan.nextLine();
		
		System.out.print("PW : ");
		String pw = scan.nextLine();
		
		if (id.equals(ADMIN_ID) && pw.equals(ADMIN_PASSWORD)) {
			System.out.println("관리자 로그인 성공!");
		} else {
			System.out.println("로그인 실패");
		}
		
		scan.close();

	}

}










