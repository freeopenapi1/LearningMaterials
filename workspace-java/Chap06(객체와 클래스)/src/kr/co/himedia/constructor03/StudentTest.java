package kr.co.himedia.constructor03;

public class StudentTest {

	public static void main(String[] args) {
		//기본 생성자 호출
		Student student = new Student();
		System.out.println(student);
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		System.out.println();
		
		//매개변수 2개 있는 생성자 호출
		Student student2 = new Student("이순신", 30);
		System.out.println(student2);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		
		System.out.println();
		
		//매개변수 String형 하나 있는 생성자 호출
		
		//매개변수 int형 하나 있는 생성자 호출

	}

}












