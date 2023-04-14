package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2 {
	// ArrayList, List, LinkedList - 2차 배열
	public static void main(String[] args) {
		String data[][] = {
				{"hong", "kim", "park"},
				{"서울","강원","경기"}
		};
		ArrayList<String[]> ar = new ArrayList<>(Arrays.asList(data)); // ArrayList에 2차 이상의 원시 배열을 넣는 방법
		System.out.println(ar.get(1)[1]);
		
		int ea = ar.size();
		System.out.println(ea); // 배열 개수
		System.out.println(ar.get(0).length); // 0번 배열의 데이터 개수
		System.out.println(Arrays.toString(ar.get(1))); // 그룹에 있는 모든 데이터 출력
		
		int w = 0;
		while(w < ar.get(0).length) {
			System.out.println(ar.get(0)[w]);
			w++;
		}
	}

}
