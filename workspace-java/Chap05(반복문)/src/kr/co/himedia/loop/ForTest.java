package kr.co.himedia.loop;

public class ForTest {

	public static void main(String[] args) {
		// 1 ~ 100까지의 합 : 
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
			//System.out.println("sum : " + sum);
		}
		System.out.println("1 ~ 100까지의 합 : " + sum);
	}

}
