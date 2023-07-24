package kr.co.himedia.interface05;

public class MyBookself extends Bookshelf implements Queue {

	@Override
	public void enQueue(String title) {
		bookshelf.add(title);
		
	}

	@Override
	public String deQueue() {
		return bookshelf.remove(0);
	}

	@Override
	public int getSize() {
		
		return getCount();
	}

}
