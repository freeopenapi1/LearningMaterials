package kr.co.himedia.reference;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student(100, "이순신");
		student.setKoreaSubject("국어", 100);
		student.setMathSubject("수학", 80);
		student.showScore();
		
		Student student2 = new Student(200, "신사임당");
		student2.setKoreaSubject("국어", 90);
		student2.setMathSubject("수학", 90);
		student2.showScore();

	}

}
