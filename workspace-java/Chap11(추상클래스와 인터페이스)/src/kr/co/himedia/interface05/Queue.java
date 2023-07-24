package kr.co.himedia.interface05;

public interface Queue {

	void enQueue(String title);
	String deQueue();
	
	int getSize();
}
