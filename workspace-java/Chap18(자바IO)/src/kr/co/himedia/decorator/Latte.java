package kr.co.himedia.decorator;

public class Latte extends Decorator {

	public Latte(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public void brew() {
		super.brew();
		System.out.print("우유 추가 ");
	}

}
