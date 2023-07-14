package kr.co.himedia.loop04;

import java.util.Scanner;

/*
 * 메뉴를 선택하세요.
 * 1.더하기
 * 2.빼기
 * 3.곱하기
 * 4.나누기
 * 5.끝내기
 * 
 * 메뉴를 잘못 선택했습니다.
 * 메뉴를 선택하세요.
 * 1.더하기
 * 2.빼기
 * 3.곱하기
 * 4.나누기
 * 5.끝내기 
 * 
 * 1
 * 첫 번째 숫자 : (5)
 * 두 번째 숫자 : (7)
 * 5 + 7 = 12
 * 메뉴를 선택하세요.
 * 1.더하기
 * 2.빼기
 * 3.곱하기
 * 4.나누기
 * 5.끝내기  
 * 
 * 5
 * 계산기를 종료합니다.
 * 
 */
public class MyCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			showMenu();
			char myChar = scanner.next().charAt(0);
			if(!checkNum(myChar)) {
				System.out.println("메뉴를 잘못 선택했습니다.");
				continue;
			}
			
			/*
			 * 문자 - 문자 
			 * '1' - '0'
			 *  49 - 48
			 *  1
			 */
			int num = myChar - '0';
			if (num == 5 )
				break;
			else {
				if(num > 5) {
					System.out.println("메뉴를 잘못 선택했습니다.");
					continue;
				}
				
				// 사칙연산 실행
				System.out.print("첫 번째 숫자 : ");
				int num1 = scanner.nextInt();
				
				System.out.print("두 번째 숫자 : ");
				int num2 = scanner.nextInt();
				
				if (num == 1)
					addNum(num1, num2);
				else if (num == 2)
					minusNum(num1, num2);
				else if (num == 3)
					multiplyNum(num1, num2);
				else if (num == 4)
					divideNum(num1, num2);
			}
		}
		
		System.out.println("계산기를 종료합니다.");
		
		scanner.close();
	}

	public static void divideNum(int x, int y) {
		int result = x / y;
		System.out.println(x +"/"+ y +"="+ result);		
		
		int result2 = x % y;
		System.out.println(x +"%"+ y +"="+ result2);			
	}

	public static void multiplyNum(int x, int y) {
		int result = x * y;
		System.out.println(x +"*"+ y +"="+ result);				
	}

	public static void minusNum(int x, int y) {
		int result = x - y;
		System.out.println(x +"-"+ y +"="+ result);		
	}

	public static void addNum(int x, int y) {
		int result = x + y;
		System.out.println(x +"+"+ y +"="+ result);
	}

	public static boolean checkNum(char myChar) {
		
		if (myChar >= '0' && myChar <= '9') {
			return true;
		}
		
		return false;
	}

	public static void showMenu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
		System.out.println("5.끝내기");
		
	}
}





















