package kr.co.himedia.interface03;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("Customer sell");
		
	}

	@Override
	public void buy() {
		System.out.println("Customer buy");
		
	}
	
	@Override
	public void order() {
		System.out.println("customer order!");
	}
	
	public void sayHello() {
		System.out.println("Hello world!");
	}

}
















