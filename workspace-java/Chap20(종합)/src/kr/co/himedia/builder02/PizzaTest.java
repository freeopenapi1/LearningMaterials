package kr.co.himedia.builder02;

import kr.co.himedia.builder02.NyPizza.Size;
import kr.co.himedia.builder02.Pizza.Topping;

public class PizzaTest {

	public static void main(String[] args) {
		
		Pizza nyPizza = new NyPizza.Builder(Size.MEDIUM)
						.addTopping(Topping.HAM)
						.addTopping(Topping.ONION)
						.build();
		System.out.println(nyPizza);
		
		Pizza nyPizza2 = new NyPizza.Builder(Size.LARGE)
						.addTopping(Topping.MUSHROOM)
						.addTopping(Topping.PEPPER)
						.build();
		System.out.println(nyPizza2);
		
		Pizza calzone = new CalzonePizza.Builder()
						.addTopping(Topping.SAUSAGE)
						.addTopping(Topping.ONION)
						.build();
		System.out.println(calzone);
		
		Pizza calzone2 = new CalzonePizza.Builder()
						.addTopping(Topping.HAM)
						.addTopping(Topping.ONION)
						.sauceInside()
						.build();
		System.out.println(calzone2);
	}
}






















