package kr.co.himedia.arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> libray = new ArrayList<>();
		
		libray.add(new Book("그림으로 이해하는 네트워크 구조와 기술", "나카오 신지"));
		libray.add(new Book("그림으로 이해하는 네트워크 구조와 기술2", "나카오 신지2"));
		libray.add(new Book("그림으로 이해하는 네트워크 구조와 기술3", "나카오 신지3"));
		libray.add(new Book("그림으로 이해하는 네트워크 구조와 기술4", "나카오 신지4"));
		libray.add(new Book("그림으로 이해하는 네트워크 구조와 기술5", "나카오 신지4"));
		
		for (int i=0; i<libray.size(); i++)
			libray.get(i).showInfo();
	}
}
