package java1;

public class Double2 {

	public static void main(String[] args) {
		// 응용문제 6.
		// 구구단 9단 중 9*64까지 숫자 중 홀수 값에 대한 평균값을 출력하시오.
		int num = 9;
		int w = 1;
		int sum, count, total;
		sum = count = total = 0;
		while(w<=64){
			total = num*w;
			if(total%2==1) {
				sum += total;
				count++;
			}
			w++;
		}
		System.out.printf("평균값은 %d입니다.",sum/count);
	}

}
