package kr.co.himedia.builder02;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
	
	public enum Topping {
		HAM, ONION, PEPPER, SAUSAGE, MUSHROOM
	}
	
	final Set<Topping> toppings;
	
	public Pizza(Builder builder) {
		this.toppings = builder.toppings.clone();
	}
	
	// Builder : 피자의 각 요소들을 생성하는데 필요한 추상메서드가 선언된 클래스(인터페이스)
	abstract static class Builder {
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
		protected abstract Builder self();
		public Builder addTopping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}
		
		public Builder sauceInside() {
			return self();
		}
		
		abstract Pizza build();
	}
	
	@Override
	public String toString() {
		return toppings.toString();
	}

}











