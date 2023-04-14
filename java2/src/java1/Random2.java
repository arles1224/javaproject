package java1;

import java.util.Arrays;

public class Random2 {
	// random() 메소드 활용
	public static void main(String[] args) {
		// 응용문제 1.
		// 1부터 46까지의 숫자 6개를 무작위로 생성했을 때, 해당 숫자들을 배열로 출력하시오.
		int ea = 6;
		int[] numbers = new int[ea];
		int w = 0;
		while(w < ea){
			numbers[w] = (int)Math.ceil(Math.random()*46);
			w++;
		}
		System.out.print(Arrays.toString(numbers));
	}

}
