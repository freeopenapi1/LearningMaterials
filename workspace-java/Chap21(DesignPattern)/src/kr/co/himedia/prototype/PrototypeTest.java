package kr.co.himedia.prototype;

import java.util.ArrayList;

class Book {
	private String author;
	private String title;
	public Book(String author, String title) {
		//super();
		this.author = author;
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "[" + author + ", " + title + "]";
	}
		
}

class BookShelf extends Object implements Cloneable {
	private ArrayList<Book> shelf;
	
	public BookShelf() {
		shelf = new ArrayList<>();
	}

	public ArrayList<Book> getShelf() {
		return shelf;
	}

	public void setShelf(ArrayList<Book> shelf) {
		this.shelf = shelf;
	}
	
	public void addBook(Book book) {
		shelf.add(book);
	}

	@Override
	public String toString() {
		return shelf.toString();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}


public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShelf bookShelf = new BookShelf();
		bookShelf.addBook(new Book("김태진1", "캐글 노하우1"));
		bookShelf.addBook(new Book("김태진2", "캐글 노하우2"));
		bookShelf.addBook(new Book("김태진3", "캐글 노하우3"));
		
		System.out.println(bookShelf);
		
		//bookShelf를 복제해서 객체생성 
		BookShelf another = (BookShelf) bookShelf.clone();
		System.out.println(another);
		
		System.out.println();
		bookShelf.getShelf().get(0).setAuthor("이순신");
		bookShelf.getShelf().get(0).setTitle("난중일기");
		
		System.out.println(bookShelf);
		System.out.println(another);		//얕은 복사가 이루어짐 
	}
}
















