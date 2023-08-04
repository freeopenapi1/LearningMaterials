package kr.co.himedia.thread03;

import java.io.IOException;

/*
 * 	세 개 thread 생성하기
 *  각각 무한 루프를 수행함
 *  작업 내용 sleep(100) 사용하기 
 *  
 *  'A' 입력하면 ThreadA 종료 
 *  'B' 입력하면 ThreadB 종료 
 *  'C' 입력하면 ThreadC 종료 
 *  'M' 입력하면 모든 thread 종료
 */
public class TerminateThread extends Thread {

	private boolean flag = false;
	
	public TerminateThread(String name) {
		super(name);
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		
		while(!flag) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(this.getName() + " end");
	}
	
	public static void main(String[] args) throws IOException {
		
		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		TerminateThread threadC = new TerminateThread("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		int in;
		while(true) {
			in = System.in.read();
			
			if (in == 'A') {
				threadA.setFlag(true);
			} else if (in == 'B') {
				threadB.setFlag(true);
			} else if (in == 'C') {
				threadC.setFlag(true);
			} else if (in == 'M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			} else 
				System.out.println("try again");
		}
		
	}
}























