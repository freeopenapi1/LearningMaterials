package kr.co.himedia.decisionIf02;

import java.util.Scanner;

/*
 * Quiz)점수가 0에서 100사이가 아니면 "유효한 점수가 아닙니다." 출력되고,  
 * 		80점 이상의 학생중에서 90점 이상은 A반, 85점 이상은 B반, 그렇지 않으면 C반으로 편성하시오.
 * 		80점 미만이면 불합격 처리하는 프로그램을 작성하시오.
 *       
 *      예시) 점수를 입력하세요 :     83 
 *           C반 편성입니다. 
 *       
 */
public class IfElseIfTest {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요. : ");
		
		Scanner scan = new Scanner(System.in);
		int jumsu = scan.nextInt();
		
		if (jumsu>=0 && jumsu<=100) {
			if (jumsu >= 80) {
				if (jumsu >= 90)
					System.out.println("A반 편성입니다.");	
				else if (jumsu >= 85) 
					System.out.println("B반 편성입니다.");				
				else 
					System.out.println("C반 편성입니다.");											
			} else 
				System.out.println("불합격입니다.");
		} else 
			System.out.println("유효한 점수가 아닙니다.");
			
		scan.close();
	}
}






















