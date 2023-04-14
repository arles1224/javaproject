package java3;

import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Collections;

public class Abstract4 {
	/*
	 * 응용문제 1.
	 * 주어진 1차 배열을 오름차순으로 정렬 후 해당 배열 데이터를 모두 더한 결과값을 출력하는 코드를 작성하시오
	 * 배열 데이터 : 1 10 15 19 8 4 7 0 2 3 9 12
	 */
	public static void main(String[] args) {
		Abst4 abst4 = new Abst4();
		abst4.datalist();
		abst4.result();
	}

}
class Abst4 extends sum_total{
	// this.sum  < 상위 클래스에 변수가 있을 때 이렇게 미리 주석을 달아 놓으면 편하다.
	Integer[] array;
	@Override
	public void datalist() {
		this.array = new Integer[] {
			1, 10, 15, 19, 8, 4, 7, 0, 2, 3, 9, 12	
		};
		Arrays.sort(array);
		// Arrays.sort(this.array,Collections.reverseOrder()); // 내림차순 정렬
		// Arrays.sort(this.array,Comparator.reverseOrder()); // 내림차순 정렬
		// Comparator : Java 8에서 새로 나왔다.
		// Collections : Java 7 이하 버전.
	}
	@Override
	public void result() {
		int ea = this.array.length;
		int w = 0;
		this.sum = 0;
		while(w < ea) {
			this.sum += this.array[w];
			w++;
		}
		System.out.println(this.sum);
		System.exit(0);
	}
}