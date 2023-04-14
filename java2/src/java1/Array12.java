package java1;

public class Array12 {
	
	public static void main(String[] args) {
		// 응용문제9.
		// 데이터 배열에 있는 모든 짝수값의 합산 결과를 출력하시오.
		// 해당 배열은 2차 배열입니다.
		// 1번 데이터 : 11 42 22 16
		// 2번 데이터 : 7 33 10 29
		// 최종 결과 : 90
		int data[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int n1, n2;
		int sum = 0;
		for(n1=0;n1<data.length;n1++) {
			for(n2=0;n2<data[0].length;n2++) {
				if(data[n1][n2]%2==0) {
					sum += data[n1][n2];
				}
			}
		}
		System.out.println(sum);
	}
}
