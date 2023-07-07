package kr.co.himedia.loop;

public class ForLoopTest {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch + ":" + (int)ch + " ");
		}
		
		System.out.println();
		
		for(char ch='a'; ch<='z'; ch++) {
			System.out.print(ch + ":" + (int)ch + " ");
		}		
		
		System.out.println();

		for(int i=65; i<=90; i++) {
			System.out.print((char)i + ":" + i + " ");
		}		
		
		System.out.println();
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		for(int su : numbers) {
			System.out.print(su + " ");
		}
	}
}

























