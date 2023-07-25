package kr.co.himedia.nongeneric;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		Powder powder = new Powder();
		printer.setMaterial(powder);
		
		Powder powder2 = printer.getMaterial();
		System.out.println(powder2);
		
		System.out.println();
		
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		Plastic plastic = new Plastic();
		printer2.setMaterial(plastic);
		
		Plastic plastic2 = printer2.getMaterial();
		System.out.println(plastic2);
		
		System.out.println();
		
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		printer3.setMaterial(powder);
		Powder powder3 = (Powder) printer3.getMaterial();
		System.out.println(powder3);
		
		
		
		
		
		
	}
}






