package kr.co.himedia.overriding;

public class Animal {

	public Animal() {
		super();
		System.out.println("Animal 기본생성자 호출");
	}
	
	public void eat() {
		System.out.println("동물이 음식을 먹다");
	}
}
