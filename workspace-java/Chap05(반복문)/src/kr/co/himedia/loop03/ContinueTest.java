package kr.co.himedia.loop03;

// 1~100까지 숫자 중 3의 배수를 출력하시오.
public class ContinueTest {

	public static void main(String[] args) {
		int num;
		for(num=1; num <= 100; num++) {
			if ((num % 3) != 0) continue;
			System.out.println(num);	
		}
	}
}
