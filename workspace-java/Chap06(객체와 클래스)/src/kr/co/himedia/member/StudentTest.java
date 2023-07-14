package kr.co.himedia.member;

public class StudentTest {

	public static void main(String[] args) {

		Student student = new Student();
		student.studentName = "이순신";
		student.address = "서울 강동구";
		student.showStudentInfo();
		
		Student student2 = new Student();
		student2.studentName = "신사임당";
		student2.address = "인천 서구";
		student2.showStudentInfo();
		
		System.out.println(student);
		System.out.println(student2);
		
	}
}
