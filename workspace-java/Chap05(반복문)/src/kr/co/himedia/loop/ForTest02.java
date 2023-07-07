package kr.co.himedia.loop;

/*
 * 누적합계가 2000 이상 일때 i값과 그때의 누적값을 출력하시오
 * 
 * 예) 2000이상 일때 i의 값 : 63
 *     2000이상 일때 i의 누적값 : 2016  	
 * 
 */
public class ForTest02 {

	public static void main(String[] args) {
		
		int sum = 0;
		int temp = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
			if(sum>=2000) {
				temp = i;
				break;
			}
		}
		System.out.println("2000이상 일때 i의 값 : " + temp);
		System.out.println("2000이상 일때 i의 누적값 : " + sum);
	}
}










