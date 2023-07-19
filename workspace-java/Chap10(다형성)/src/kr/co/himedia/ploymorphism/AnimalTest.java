package kr.co.himedia.ploymorphism;

class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eat() {
		System.out.println("동물이 먹습니다.");
	}
	
}

class Dog extends Animal {
	
	@Override
	public void move() {
		System.out.println("개가 네발로 걷습니다.");
	}
	
	public void playball() {
		System.out.println("개가 견주가 던진 공을 물어옵니다.");
	}
}

public class AnimalTest {
	
	public static void main(String[] args) {
		
	}
	
}
























