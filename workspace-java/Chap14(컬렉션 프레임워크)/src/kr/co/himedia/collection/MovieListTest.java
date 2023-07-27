package kr.co.himedia.collection;

import java.util.ArrayList;

public class MovieListTest {

	public static void main(String[] args) {
		
		ArrayList<Movie> list=new ArrayList<>();
		list.add(new Movie("미션 임파서블: 데드 레코닝 PART ONE", "Christopher McQuarrie", "2023", "미국"));
		list.add(new Movie("범죄도시3", "이상용", "2023", "한국"));
		list.add(new Movie("범죄도시4", "이상용", "2023", "한국"));
		
		for (Movie movie : list) {
			System.out.println(movie);
		}
	}
}
