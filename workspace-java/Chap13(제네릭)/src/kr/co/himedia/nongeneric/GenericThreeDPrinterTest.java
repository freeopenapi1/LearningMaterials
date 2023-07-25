package kr.co.himedia.nongeneric;

public class GenericThreeDPrinterTest {

	public static void main(String[] args) {
		
		GenericThreeDPrinter<Powder> powerPrinter = new GenericThreeDPrinter<>();
		powerPrinter.setMaterial(new Powder());
		Powder powder = powerPrinter.getMaterial();
		System.out.println(powerPrinter);
		
		GenericThreeDPrinter<Plastic> plasticPrinter = new GenericThreeDPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}
}
