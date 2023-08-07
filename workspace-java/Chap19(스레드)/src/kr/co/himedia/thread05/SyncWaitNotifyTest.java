package kr.co.himedia.thread05;

import java.util.ArrayList;

class HiMediaBooks {
	
	public ArrayList<String> shelf = new ArrayList<>();
	
	public HiMediaBooks() {
		shelf.add("친절한 깃&깃허브1");
		shelf.add("친절한 깃&깃허브2");
		shelf.add("친절한 깃&깃허브3");
		shelf.add("친절한 깃&깃허브4");
		shelf.add("친절한 깃&깃허브5");
		shelf.add("친절한 깃&깃허브6");
	}
	
	public String lendBook() {
		String book = shelf.remove(0);
		System.out.println(Thread.currentThread().getName() +" : "+ book + " 빌림");
		return book;
	}
	
	public void returnBook(String book) {
		shelf.add(book);
		System.out.println(Thread.currentThread().getName() +" : "+ book + " 반납함");
	}
	
}

class Person extends Thread {
	
	public Person(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		String title = SyncWaitNotifyTest.hiBooks.lendBook();
		
		if (title == null) return;
		try {
			Thread.sleep(5000);
			SyncWaitNotifyTest.hiBooks.returnBook(title);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}

public class SyncWaitNotifyTest {
	
	public static HiMediaBooks hiBooks = new HiMediaBooks();
	
	public static void main(String[] args) {
		Person person1 = new Person("person1");
		Person person2 = new Person("person2");
		Person person3 = new Person("person3");
		Person person4 = new Person("person4");
		Person person5 = new Person("person5");
		Person person6 = new Person("person6");
		
		person1.start();
		person2.start();
		person3.start();
		person4.start();
		person5.start();
		person6.start();
	}

}

















