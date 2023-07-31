package kr.co.himedia.lambda10;

@FunctionalInterface					//함수형 인터페이스
public interface MathOperation {
	int operation(int x, int y);		//추상메서드
}
