package kr.co.himedia.arraylist02;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentL = new Student(2023, "LEE");
		studentL.addSubject("국어", 100);
		studentL.addSubject("수학", 80);
		
		Student studentS = new Student(2022, "Shin");
		studentS.addSubject("국어", 90);
		studentS.addSubject("수학", 95);
		studentS.addSubject("영어", 100);
		
		studentL.showInfo();
		System.out.println();
		studentS.showInfo();
	}
}
