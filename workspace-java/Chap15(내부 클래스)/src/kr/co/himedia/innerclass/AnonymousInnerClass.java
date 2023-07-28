package kr.co.himedia.innerclass;

class Outter {
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			int localNum = 10;
			
			@Override
			public void run() {	//이 run() 메서드는 나중에 또 호출될 수 있음 
				//i = 100;		//매개변수는 상수(final)로 바뀜
				//num = 200;	//지역변수는 상수(final)로 바뀜
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
			}
			
		};
		
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
			
		}
	};
	
	
}


public class AnonymousInnerClass {

	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		
		out.runner.run();
	}
}
















