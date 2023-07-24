package kr.co.himedia.templatemethod02;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("jump 못합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("trun 못합니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*********초급자 레벨********");
		
	}

}
