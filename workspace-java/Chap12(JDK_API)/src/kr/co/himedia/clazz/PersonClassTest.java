package kr.co.himedia.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonClassTest {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class c1 = Class.forName("kr.co.himedia.clazz.Person");
		
		// new 키워드를 사용하지 않고 인스턴스를 생성
		Person person = (Person) c1.newInstance();
		
		person.setName("이순신");
		System.out.println(person);
		
		//person 객체에서 Class 클래스 가져오기
		Class c2 = person.getClass();
		Person p = (Person) c2.newInstance();
		System.out.println(p);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"신사임당"};
		Person personShin = (Person) cons.newInstance(initargs);
		System.out.println(personShin);
		
		Person personShin2 = new Person("신사임당2");
		System.out.println(personShin2);
	}

}
















