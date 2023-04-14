package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {
		/*
		 * 응용문제 3.
		 * 숫자 데이터 3 6 9 12 15 
		 * 숫자 데이터 2 4
		 * 결과 2 3 4 6 9 12 15
		 * 코드를 작성하시오.
		 */
		Integer[] three = {3,6,9,12,15};
		Integer[] two = {2,4};
		ArrayList<Integer> th = new ArrayList<>(Arrays.asList(three));
		ArrayList<Integer> tw = new ArrayList<>(Arrays.asList(two));
		th.addAll(tw); // addAll : 배열 전체가 추가된다.
		Collections.sort(th);
		System.out.println(th);
		
		// 무한 루프 : while과 do-while에서만 사용할 수 있다.
		Scanner scanner = new Scanner(System.in);
		while(true) { // 사용자가 숫자 10을 입력하면 종료하는 무한루프.
			System.out.println("숫자를 입력하세요");
			int a = scanner.nextInt();
			if(a == 10) {
				break; // 반복문 종료
			}
		}
		scanner.close();
		
	}

}
