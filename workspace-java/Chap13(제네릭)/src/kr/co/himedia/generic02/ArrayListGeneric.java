package kr.co.himedia.generic02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {

	public static void main(String[] args) {
		
		List<Movie> list = new ArrayList<>();
		list.add(new Movie("미션 임파서블: 데드 레코닝 PART ONE", "Christopher McQuarrie", "2023", "미국"));
		list.add(new Movie("범죄도시3", "이상용", "2023", "한국"));
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}
