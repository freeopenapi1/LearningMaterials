package kr.co.himedia.exception02;

public class AutoCloseableTestLab {

	public static void main(String[] args) {
		
		AutoCloseableTest obj = new AutoCloseableTest();
		
		try(obj) {
			System.out.println("프로그램 실행");
			throw new Exception();
		
		} catch(Exception e) {
			System.out.println("예외 처리 부분입니다.");
		}
		
		System.out.println("end");
	}
}
