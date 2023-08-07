package kr.co.himedia.decorator;

public abstract class Decorator extends Coffee {

	Coffee coffee;
	
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brew() {
		coffee.brew();		
	}

}
