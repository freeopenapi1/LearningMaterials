package kr.co.himedia.inheritance02;

public class EmployeeTest {

	public static void main(String[] args) {
		RempDTO dto = new RempDTO();
		System.out.println(dto);
		
		//상속관계에서 초기화 => 부모의 생성자에서 초기화 (정보은닉 적용)
		RempDTO dto2 = 
				new RempDTO("이순신", 30, "010-2311-1234", "2023-07-01", "개발팀");
		System.out.println(dto2);
	}
}
