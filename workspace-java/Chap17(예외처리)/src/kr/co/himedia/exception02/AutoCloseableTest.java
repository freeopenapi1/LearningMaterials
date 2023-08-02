package kr.co.himedia.exception02;

public class AutoCloseableTest implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다.");
	}

}
