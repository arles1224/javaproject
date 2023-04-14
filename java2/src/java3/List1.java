package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class List1 {
	// List 라이브러리 사용법
	public static void main(String[] args) {
		String member[] = {"박소은","윤준승","김여름"}; // 원시 배열. 값을 추가하거나 삭제하기 힘들다.
		// ArrayList : 자바 라이브러리 배열 리스트.
		// add : 기본으로는 데이터가 배열 맨 뒤에 추가된다. index 번호를 적용 후 실행하면 해당 위치에 추가할 수 있다.
		// get : 배열 데이터 로드
		// remove : 배열값 삭제
		// size : 배열 데이터 개수
		ArrayList<String> al = new ArrayList<>(Arrays.asList(member));
		// Arrays.asList : java.util.Arrays 라이브러리. 로드할 배열 값
		System.out.println(al.size()); // 배열 데이터 개수 출력
		/*
		al.add("박소은");
		al.add("윤준승");
		al.add("김여름");
		*/
		al.add(0,"심규환");
		al.add("이하늘");
		String user = al.get(4);
		System.out.println(user);
		al.remove(4);
		System.out.println(al); // 배열 내용을 출력하는 데 Arrays.toString을 사용하지 않는다.
	}

}
