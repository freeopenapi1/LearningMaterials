package kr.co.himedia.generic04;

public class Plastic extends Material {
	
	@Override
	public String toString() {
		return "재료는 Plastic 입니다.";
	}

	@Override
	public void doPrint() {
		System.out.println("Plastic 재료로 출력합니다.");
		
	}

}
