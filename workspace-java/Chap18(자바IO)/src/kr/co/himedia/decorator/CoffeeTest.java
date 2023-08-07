package kr.co.himedia.decorator;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee kenyaAmericano = new KenyaAmericano();
		kenyaAmericano.brew();
		System.out.println();
		
		Coffee kenyaLatte = new Latte(kenyaAmericano);
		kenyaLatte.brew();
		System.out.println();
		
		Mocha kenyaMocha = new Mocha(new Latte(kenyaAmericano));
		kenyaMocha.brew();
		System.out.println();
		
		WhippedCream etiopiaWhippedMocha = 
				new WhippedCream(new Mocha(new Latte(new EtiopiaAmericano())));
		etiopiaWhippedMocha.brew();
		
	}
}












