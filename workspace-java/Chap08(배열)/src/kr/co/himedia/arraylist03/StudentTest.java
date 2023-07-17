package kr.co.himedia.arraylist03;

/*
 * 	HiMedia 학원에 학생이 3명 있습니다.
 * 	각 학생마다 읽은 책을 기록하고 있습니다.
 *  학생마다 읽은 책을 Student 클래스내에 ArrayList를 생성하여 관리하도록 합니다.
 *  
 *  다음과 가타이 출력되게 클래스를 만들어서 구현하시오.
 *  
 *  Lee 학생이 읽은 책은 : 운영체제1, 운영체제2 입니다.
 *  Shin 학생이 읽은 책은 : 딥러닝1, 딥러닝2, 딥러닝3 입니다.
 *  Kim 학생이 읽은 책은 : 머신러닝1, 머신러닝2, 머신러닝3, 머신러닝4, 머신러닝5, 머신러닝6 입니다.
 *  
 */
public class StudentTest {

	public static void main(String[] args) {
		Student studentL = new Student(1001, "Lee");
		studentL.addBook("운영체제1", "인공지능");
		studentL.addBook("운영체제2", "구글");
		
		Student studentS = new Student(1002, "Shin");
		studentS.addBook("딥러닝1", "세종대왕");
		studentS.addBook("딥러닝2", "이성계");
		studentS.addBook("딥러닝3", "이방원");
		
		Student studentK = new Student(1003, "Kim");
		studentK.addBook("머신러닝1", "정도전");
		studentK.addBook("머신러닝2", "이인임");
		studentK.addBook("머신러닝3", "최영");
		studentK.addBook("머신러닝4", "궁예");
		studentK.addBook("머신러닝5", "왕건");
		studentK.addBook("머신러닝6", "남은");
		
		studentL.showInfo();
		studentS.showInfo();
		studentK.showInfo();
		
		
	}
}






























