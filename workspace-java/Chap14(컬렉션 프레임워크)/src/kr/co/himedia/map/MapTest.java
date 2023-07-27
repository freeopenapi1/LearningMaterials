package kr.co.himedia.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		//key-value 형태의 데이터를 관리하는 Map 객체 생성 
		Map<String, Integer> scoreMap = new HashMap<>();
		
		//데이터 추가
		scoreMap.put("이순신", 98);
		scoreMap.put("이방원", 90);
		scoreMap.put("신사임당", 92);
		scoreMap.put("류성룡", 80);
		
		//데이터 조회 
		System.out.println("이순신의 점수 : " + scoreMap.get("이순신"));
		System.out.println("이순신의 점수 : " + scoreMap.get("류성룡"));
		
		//데이터 수정
		scoreMap.put("신사임당", 100);
		System.out.println("신사임당의 점수 : " + scoreMap.get("신사임당"));
		
		//데이터 삭제
		scoreMap.remove("이방원");
		System.out.println("이방원의 점수 : " + scoreMap.get("이방원"));
		
		System.out.println();
		
		//전체 데이터 출력
		for(Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
			System.out.println(entry.getKey() + "의 점수는 " + entry.getValue());
		}
	}
}





















