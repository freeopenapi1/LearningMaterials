package kr.co.himedia.overriding;

public class DogCatTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.eat();
		
		System.out.println();
		
		Cat cat = new Cat();
		cat.eat();
		
		System.out.println();
		
		//업캐스팅(Upcasting)
		Animal animal = new Dog();
		animal.eat();				//동적바인딩 - 실행시점에서 사용될 메서드가 결정되는 바인딩
		
		//다운캐스팅(Downcasting)
		Dog ddog = (Dog)animal;
		ddog.chase();
		
		System.out.println();
		
		((Dog)animal).chase();
		
	}
}





















