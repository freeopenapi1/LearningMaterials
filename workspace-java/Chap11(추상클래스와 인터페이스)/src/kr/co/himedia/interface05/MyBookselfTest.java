package kr.co.himedia.interface05;

public class MyBookselfTest {

	public static void main(String[] args) {
		
		Queue bQueue = new MyBookself();
		bQueue.enQueue("된다! 하루 만에 끝내는 챗GPT 활용법");
		bQueue.enQueue("진짜 챗GPT 활용법");
		bQueue.enQueue("챗GPT와 글쓰기");
		bQueue.enQueue("챗GPT와 글쓰기2");
		bQueue.enQueue("챗GPT와 글쓰기3");
		
		System.out.println(bQueue.getSize());
		
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
	}
}
