package kr.co.himedia.member;

/*
 * 1. 클래스는 대문자로 시작함
 * 2. java 파일 하나에 여러 개의 class가 있을 수 있음.
 * 	- public 클래스는 하나임
 * 	- public 클래스와 .java 파일의 이름은 동일함
 */

class A {}
class B {}
public class Student {

	public int studentId;
	public String studentName;
	public String address;
	
	//public Student() {}
	
	public void showStudentInfo() {
		System.out.println(studentName +", "+ address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}
