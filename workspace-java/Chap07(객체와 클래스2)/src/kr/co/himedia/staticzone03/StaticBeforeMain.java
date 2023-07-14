package kr.co.himedia.staticzone03;

import java.util.Random;

public class StaticBeforeMain {

	static int num;				// 스태틱 멤버 변수 
	
	static {					// static 초기화 블록
		Random random = new Random();
		num = random.nextInt(100);			// 0~99사이 임의의 숫자 반환
	}
	
	public static void main(String[] args) {
		System.out.println(num);
	}
}
