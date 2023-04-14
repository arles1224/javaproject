package java3;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class List6 {
	// LinkedList 배열. 데이터 추가와 삭제 속도와 데이터 검색 속도가 빠르다
	// 단점 : 메모리 크기가 크다. 
	// 내부적으로 배열을 사용하지 않고, 각 요소가 독립적인 객체이기 때문에 ArrayList와 다르게 인덱스를 이용해 요소에 빠르게 접근하기 힘들다.
	// 그래서 각 요소들을 순서대로 탐색하면서 요소에 접근해야되기 때문에 ArrayList보다 특정 요소를 찾는 작업에 더 많은 시간이 필요할 수 있다. 
	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5};
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a));
		ln.add(2);
		System.out.println(ln);
		Collections.sort(ln);
		ln.addFirst(2); // 배열 맨 앞에 데이터를 추가한다. LinkedList 전용.
		ln.addLast(30);
		ln.removeLast(); // 배열 맨 마지막 데이터를 지운다.
		ln.remove(5); // 지정한 노드의 데이터가 지워진다. 노드를 지정하지 않으면배열 맨 앞 데이터가 지워진다.
		//ln.removeAll(ln); // 배열 안의 모든 데이터를 지운다. 배열은 남아있다.
		System.out.println(ln);
		
		// 문자열 형태의 LinkedList
		String[] b = {"aa","bb","cc","dd"};
		LinkedList<String> ls = new LinkedList<>(Arrays.asList(b));
		ls.remove("cc"); // 문자열 배열일 경우 해당 데이터를 삭제한다.
		ls.addFirst("zz");
		System.out.println(ls);
	}

}
