package kr.co.himedia.generic04;

public class GenericThreeDPrinterTest {

	public static void main(String[] args) {
		
		GenericThreeDPrinter<Powder> genericThPrinter = new GenericThreeDPrinter<>();
		
		Powder powder = new Powder();
		genericThPrinter.setMaterial(powder);
		System.out.println(genericThPrinter);
		
		
		GenericThreeDPrinter<Plastic> genericThDPrinter2 = new GenericThreeDPrinter<>();
		
		Plastic plastic = new Plastic();
		genericThDPrinter2.setMaterial(plastic);
		System.out.println(genericThDPrinter2);
		
		genericThPrinter.print();
		genericThDPrinter2.print();
	}
}
