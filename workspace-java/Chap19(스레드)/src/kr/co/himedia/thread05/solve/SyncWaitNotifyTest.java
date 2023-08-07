package kr.co.himedia.thread05.solve;

import java.util.ArrayList;

class HiMediaBooks {
	
	public ArrayList<String> shelf = new ArrayList<>();
	
	public HiMediaBooks() {
		shelf.add("친절한 깃&깃허브1");
		shelf.add("친절한 깃&깃허브2");
		shelf.add("친절한 깃&깃허브3");
	}
	
	//세명만 빌릴수 있는 상황임
	public synchronized String lendBook() throws InterruptedException {
		
		if (shelf.size() == 0) {
			System.out.println(Thread.currentThread().getName() + " waiting start ");
			wait();
			System.out.println(Thread.currentThread().getName() + " waiting end ");
		}
			
		if (shelf.size() > 0) {
			String book = shelf.remove(0);
			System.out.println(Thread.currentThread().getName() +" : "+ book + " 빌림");
			return book;			
		}
		else return null;

	}
	
	public synchronized void returnBook(String book) {
		shelf.add(book);
		notify();
		System.out.println(Thread.currentThread().getName() +" : "+ book + " 반납함");
	}
	
}

class Person extends Thread {
	
	public Person(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		String title;
		try {
			title = SyncWaitNotifyTest.hiBooks.lendBook();
			if (title == null) {
				System.out.println(getName() + " 빌리지 못했음");
				return;
			}
			
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

















