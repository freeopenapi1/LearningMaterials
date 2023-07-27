package kr.co.himedia.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest02 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple");
		
		System.out.println(set.size());
		
		System.out.println(set.toString());
		
		for (String element : set) {
			System.out.println(element);
		}
		
		set.remove("Banana");
		System.out.println(set);
		
		boolean contains = set.contains("Cherry");
		System.out.println(contains);
		
		set.clear();
		
		boolean empty = set.isEmpty();
		System.out.println(empty);
		System.out.println(set);
	}
}




































