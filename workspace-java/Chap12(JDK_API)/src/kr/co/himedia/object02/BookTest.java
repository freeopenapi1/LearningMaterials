package kr.co.himedia.object02;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
//	@Override
//	public String toString() {
//		return title +", "+ author;
//	}
	
	@Override
	public int hashCode() {
		System.out.println("hash code!");
		return super.hashCode();
	}
}

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("문제해결 파이썬 with 기본 수학", "이경미");
		System.out.println(book.toString());
	}
}
