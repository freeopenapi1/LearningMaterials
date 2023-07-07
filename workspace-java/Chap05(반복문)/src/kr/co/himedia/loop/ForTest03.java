package kr.co.himedia.loop;

public class ForTest03 {

	public static void main(String[] args) {
		int sum = 0;
		int count = 1;
		
		int i = 0;
		for( ; i < 10 ; i++) {
			sum += count;
			count++;
		}
		
		System.out.println(sum);
		
		System.out.println();
		sum = 0;
		count = 1;
		
		for(i = 0; ; i++) {
			sum += i;
			if (i >= 10) break;
		}
		System.out.println(sum);
		
		System.out.println();
		sum = 0;	
		
		for(i = 0; i <= 10; ) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
//		for( ; ; ) {
//			//무한반복
//		}
		
	}
}














