package kr.co.himedia.templatemethod02;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump 합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("trun 합니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*********고급자 레벨********");
		
	}

}
