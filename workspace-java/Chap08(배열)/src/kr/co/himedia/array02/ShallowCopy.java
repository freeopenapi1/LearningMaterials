package kr.co.himedia.array02;

public class ShallowCopy {

	public static void main(String[] args) {
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("혼자 공부하는 파이썬", "윤인성");
		book[1] = new Book("혼자 공부하는 파이썬2", "윤인성2");
		book[2] = new Book("혼자 공부하는 파이썬3", "윤인성3");
		book[3] = new Book("혼자 공부하는 파이썬4", "윤인성4");
		book[4] = new Book("혼자 공부하는 파이썬5", "윤인성5");
		
		System.arraycopy(book, 0, copyBook, 0, 5);
		
		System.out.println("----------원본------------");
		for(Book booki : book) {
			booki.showInfo();
		}
		System.out.println("----------복사본------------");
		for(Book booki : copyBook) {
			booki.showInfo();
		}		
	
		System.out.println();
		book[0].setTitle("한글");
		book[0].setAuthor("세종대왕");
		
		System.out.println("----------원본------------");
		for(Book booki : book) {
			booki.showInfo();
		}
		System.out.println("----------복사본------------");
		for(Book booki : copyBook) {
			booki.showInfo();
		}				
		
	}
}
























