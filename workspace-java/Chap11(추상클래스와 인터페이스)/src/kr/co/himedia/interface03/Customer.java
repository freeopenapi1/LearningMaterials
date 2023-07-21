package kr.co.himedia.interface03;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void order() {
		System.out.println("customer order!");
	}

}
