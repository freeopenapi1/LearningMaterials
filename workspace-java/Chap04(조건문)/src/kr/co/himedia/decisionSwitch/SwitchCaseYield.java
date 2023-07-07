package kr.co.himedia.decisionSwitch;

public class SwitchCaseYield {

	public static void main(String[] args) {
		
		int month = 2;
		
		int day =  switch(month) {
			case 1,3,5,7,8,10,12 -> {
				System.out.println("31일까지 입니다.");
				yield 31;
			}
			case 4,6,9,11 -> {
				System.out.println("30일까지 입니다.");
				yield 30;
			}
			case 2 -> {
				System.out.println("28일까지 입니다.");
				yield 28;
			}
			default -> {
				System.out.println("존재하지 않는 달입니다.");
				yield 0;
			}
		};
	}
}
