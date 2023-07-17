package kr.co.himedia.arraylist;

public class Book {
	private String title;
	private String author;
	
	public Book() {	}

	public Book(String title, String author) {
		//super();
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(title +", "+ author);
	}

}







