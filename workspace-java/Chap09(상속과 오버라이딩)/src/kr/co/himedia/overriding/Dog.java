package kr.co.himedia.overriding;

public class Dog extends Animal {
	
	public Dog() {
		super();
		System.out.println("Dog 기본생성자 호출");
	}
	
	public void eat() {
		System.out.println("댕댕이가 음식을 먹다");
	}
	
	public void chase() {
		System.out.println("댕댕이가 공을 쫒아가다");
	}

}
