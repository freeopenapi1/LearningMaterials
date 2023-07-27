package kr.co.himedia.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add(new String("이순신"));
		set.add(new String("이도"));
		set.add(new String("신사임당"));
		set.add(new String("세종대왕"));
		set.add(new String("세종대왕"));
		
		System.out.println(set.toString());
	}
}
