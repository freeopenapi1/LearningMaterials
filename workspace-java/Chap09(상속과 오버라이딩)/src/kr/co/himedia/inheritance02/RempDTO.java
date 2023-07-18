package kr.co.himedia.inheritance02;

public class RempDTO extends Employee {
	
	public RempDTO() {
		//super(); 
		
	}

	public RempDTO(String name, int age, String phone, String empDate, String dept) {
		super(name, age, phone, empDate, dept);		// 부모 생성자 호출
		// TODO Auto-generated constructor stub
	}
	
	

	
}
