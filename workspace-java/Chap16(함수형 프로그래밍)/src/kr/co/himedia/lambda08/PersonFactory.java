package kr.co.himedia.lambda08;

@FunctionalInterface
public interface PersonFactory {

	Person create(String name, int age);
	
}
