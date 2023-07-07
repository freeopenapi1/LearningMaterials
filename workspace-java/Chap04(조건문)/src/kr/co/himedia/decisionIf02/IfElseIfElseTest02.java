package kr.co.himedia.decisionIf02;

import java.util.Scanner;

public class IfElseIfElseTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("점수가 90~100점 사이입니다.");
			System.out.println("등급은 A입니다.");
		}
		else if(score >= 80 && score < 90) {
			System.out.println("점수가 80~89점 사이입니다.");
			System.out.println("등급은 B입니다.");			
		}		
		else if(score >= 70 && score < 80) {
			System.out.println("점수가 70~79점 사이입니다.");
			System.out.println("등급은 C입니다.");			
		}		
		else if(score >= 60 && score < 70) {
			System.out.println("점수가 70~69점 사이입니다.");
			System.out.println("등급은 D입니다.");			
		}	
		else if(score >= 0 && score < 60) {
			System.out.println("등급은 F입니다.");	
		}
		else {
			System.out.println("잘못입력했습니다.");
		}
		
		System.out.println();
		
		/*
		 * Validation :  score 변수의 값에 따라서 조건문 분기가 일어나며,
		 *               정확한 값 범위를 사용하겠다는 것
		 */
		
		if (score >= 0 && score <= 100) {
			if (score >= 90)
				System.out.println("A");
			else if (score >= 80) 
				System.out.println("B");
			else if (score >= 70)
				System.out.println("C");
			else if (score >= 60)
				System.out.println("D");
			else
				System.out.println("F");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		scan.close();
	}
}











