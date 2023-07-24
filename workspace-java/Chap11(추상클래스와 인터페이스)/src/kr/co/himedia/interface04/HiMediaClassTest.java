package kr.co.himedia.interface04;

public class HiMediaClassTest {

	public static void main(String[] args) {
		
		HiMediaClass hClass = new HiMediaClass();
		hClass.x();
		hClass.y();
		hClass.myMethod();
		
		X xClass = hClass;
		xClass.x();
		
		Y yClass = hClass;
		yClass.y();
		
		HiMediaInterface hClazz = hClass;
		hClazz.myMethod();
	}
}
