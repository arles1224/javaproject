package java3;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	// key 배열
	
	/*
	 * Map 사용시 주의사항
	 * 1. 키는 중복될 수 없다.
	 * 2. 데이터는 키값을 통해서 가져온다.
	 * 3. put으로 데이터를 추가할 때 같은 키를 사옹 시 기존에 있는 데이터 값은 상실된다.
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); // 빈 키배열 생성
		map.put("id", "hong");
		map.put("name", "홍길동");
		map.put("address", "서울시 종로구");
		map.remove("id");
		System.out.println(map);
		System.out.println(map.get("name"));
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("number", 10);
		map2.put("tel", 1012345678); // 숫자는 0이 제일 앞자리에 들어갈 수 없다.
	}
}
