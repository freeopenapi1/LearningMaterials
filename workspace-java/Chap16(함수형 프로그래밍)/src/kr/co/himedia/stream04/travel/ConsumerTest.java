package kr.co.himedia.stream04.travel;

import java.util.ArrayList;
import java.util.List;

import kr.co.himedia.stream04.model.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer consumerL = new Consumer("이순신", 40, 100);
		Consumer consumerN = new Consumer("나대용", 20, 100);
		Consumer consumerG = new Consumer("권율", 13, 50);
		
		List<Consumer> consumerList = new ArrayList<>();
		consumerList.add(consumerL);
		consumerList.add(consumerN);
		consumerList.add(consumerG);
		
		//고객 명단을 출력하시오
		System.out.println("==고객 명단 추가 순서대로 출력==");
		consumerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		System.out.println();
		
		//여행 총 비용을 계산하시오. (총 비용은 250만원 입니다.)
		int total = consumerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 비용은 " +total+ "만원 입니다.");
		
		//고객 중 20세 이상인 사람의 이름을 정렬하여 출력하시오. 
		/*
		 * 나대용
		 * 이순신
		 */
		System.out.println("==20세 이상인 사람의 이름 정렬하여 출력==");
		consumerList.stream().filter(c -> c.getAge() >= 20)
							.map(c -> c.getName())
							.sorted()
							.forEach(s -> System.out.println(s));
	}
}

























