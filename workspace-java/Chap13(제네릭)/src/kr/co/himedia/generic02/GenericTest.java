package kr.co.himedia.generic02;

public class GenericTest {

	public static void main(String[] args) {
		
		ObjectArr<Movie> oArr = new ObjectArr<>(5);
		oArr.set(0, new Movie("미션 임파서블: 데드 레코닝 PART ONE", "Christopher McQuarrie", "2023", "미국"));
		oArr.set(1, new Movie("범죄도시3", "이상용", "2023", "한국"));
		oArr.set(2, new Movie("엘리멘탈 ", "Peter Sohn", "2023", "미국"));
		
		for(int i=0; i<oArr.size(); i++)
			System.out.println(oArr.get(i));
	}
}
