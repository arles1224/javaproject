package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List2 {

	public static void main(String[] args) {
		// kim 외의 나머지 사용자 출력하는 방법
		String user[] = {"hong","kim","park","jang"}; // 원시 배열
		ArrayList<String> al = new ArrayList<>(Arrays.asList(user));
		//int ea = al.size();
		int w = 0;
		/* while (w < ea){ // 반복문이 돌 때마다 ea의 값을 검토하는 방법도 있다.
		 *		ea = al.size() 
		 */
		while(w < al.size()) { // 반복할 때마다 사이즈를 검토하도록 하면 에러가 발생하지 않는다.
			if(al.get(w).equals("kim")) {
				al.remove(w); 
				// 주의! 
				// 노드를 지우거나 추가할 때 반복문 돌아가는 범위를 ea로 하면,
				// ea는 4로 고정되어 있는데 노드 번호는 하나씩 줄어들어서 index 3번이 없어지면서 에러가 발생한다.
			}
			w++;
		}
		System.out.println(al);
		
		// 응용문제
		// 해당 배열을 확인 후 짝수의 숫자를 모두 삭제하여 최종 결과 배열을 출력하시오.
		// 10 7 6 1 11 37 41 22
		// 결과) 7 1 11 37 41
		Integer array[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> odd = new ArrayList<>(Arrays.asList(array));
		int w1 = 0;
		while(w1 < odd.size()) {
			if(odd.get(w1)%2==0) {
				odd.remove(w1);
			}
			w1++;
		}
		Collections.sort(odd); // 오름차순으로 정렬
		Collections.sort(odd,Collections.reverseOrder()); // 내림차순으로 정렬
		System.out.println(odd);
	}

}
