package kr.co.himedia.dto;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "이순신";
		person.age = 30;
		person.phone = "010-1234-6789";
		person.play();
		person.eat();
		person.walk();
		System.out.println(person.toString());
		
		Person person2 = new Person();
		person2.name = "신사임당";
		person2.age = 50;
		person2.phone = "010-2312-3454";
		person2.play();
		person2.eat();
		person2.walk();
		System.out.println(person2);
		
	}
}
