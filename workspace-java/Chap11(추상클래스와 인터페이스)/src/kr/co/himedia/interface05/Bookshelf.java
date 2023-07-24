package kr.co.himedia.interface05;

import java.util.ArrayList;

//책꽃이 
public class Bookshelf {
	
	protected ArrayList<String> bookshelf;
	
	public Bookshelf() {
		bookshelf = new ArrayList<>();
	}
	
	public ArrayList<String> getBookshelf() {
		return bookshelf;
	}
	
	public int getCount() {
		return bookshelf.size();
	}

}
