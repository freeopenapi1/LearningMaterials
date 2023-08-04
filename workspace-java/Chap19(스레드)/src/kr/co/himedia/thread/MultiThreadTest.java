package kr.co.himedia.thread;

/*
 * 두개 스레드 동시 실행
 * 	- 10미만 수 출력 (9부터 1까지)
 * 	- 20미만 짝수 출력 
 */
public class MultiThreadTest {

	public static void main(String[] args) {
		
		Runnable task1 = () -> {
			//20미만 짝수 출력
			for (int i=0; i<20; i=i+2) {
				System.out.print(i + " ");
				try {
					Thread.sleep(1000);		//1000밀리세컨드(1초) 쉼
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable task2 = () -> {
			//10미만 수 출력 (9부터 1까지)
			for(int i=9; i>0; i--) {
				System.out.print("("+i+")" + " ");
				try {
					Thread.sleep(500);		//500밀리세컨드(0.5초) 쉼
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
	}
}



























