package kr.co.himedia.inheritance02;

public class Employee /* extends Object */ {
	private String name;
	private int age;
	private String phone;
	private String empDate;
	private String dept;
	
	public Employee() {
		/* super(); */ 
	}

	public Employee(String name, int age, String phone, String empDate, String dept) {
		//super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.empDate = empDate;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", phone=" + phone + ", empDate=" + empDate + ", dept="
				+ dept + "]";
	}
	
	
	
	
}
