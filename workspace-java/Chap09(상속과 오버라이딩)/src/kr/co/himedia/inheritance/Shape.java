package kr.co.himedia.inheritance;

//조상클래스
public class Shape {

	String color = "black";
	
	public Shape() {
		System.out.println("Shape 클래스의 기본 생성자 호출");
	}
	
	public void draw() {
		System.out.println("draw()");
	}
}
