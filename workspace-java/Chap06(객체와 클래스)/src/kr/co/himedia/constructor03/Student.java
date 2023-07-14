package kr.co.himedia.constructor03;

public class Student {
	
	private String name;
	private int age;
	
	
	public Student() {
		System.out.println("기본생성자 호출");
	}
	
	public Student(String name) {
		System.out.println("매개변수가 String만 있는 생성자 호출");
		this.name = name;
	}
	
	public Student(int age) {
		System.out.println("매개변수가 int만 있는 생성자 호출");
		this.age = age;
	}
	
	public Student(String name, int age) {
		System.out.println("매개변수가 String, int 있는 생성자 호출");
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	

}





























