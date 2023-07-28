package kr.co.himedia.lambda;

public class TestAdd {
	
	public static void main(String[] args) {
		
		//Add addF = (int x, int y) -> {return x+y;};
		//람다식 구현
		Add addF = (x, y) -> x+y;
		
		//람다식 호출 
		System.out.println(addF.add(3, 5));
	}

}
