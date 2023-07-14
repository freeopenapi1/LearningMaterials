package kr.co.himedia.array02;

import java.util.Arrays;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] book = new Book[5];		
		System.out.println(Arrays.toString(book));
		
		book[0] = new Book("혼자 공부하는 파이썬", "윤인성");
		book[1] = new Book("혼자 공부하는 파이썬2", "윤인성2");
		book[2] = new Book("혼자 공부하는 파이썬3", "윤인성3");
		book[3] = new Book("혼자 공부하는 파이썬4", "윤인성4");
		book[4] = new Book("혼자 공부하는 파이썬5", "윤인성5");
		
		System.out.println(Arrays.toString(book));
		
		for(int i=0; i<book.length; i++) {
			//System.out.println(book[i]);
			book[i].showInfo();
		}
		
	}
}
