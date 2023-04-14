package java1;

public class Double1 {

	public static void main(String[] args) {
		// 응용문제 5.(do while문으로 제작)
		// 다음과 같이 합계를 출력하는 loop문을 작성하시오.
		// 예시) 
		// 5+5=10
		// 5+4=9 ....
		// 2+5=7 ....
		// 2+1=3
		
		byte num1 = 5;
		int num2, sum;
		do {
			num2 = 5;
			do {
				sum = num1 + num2;
				System.out.printf("%d+%d=%d\n",num1,num2,sum);
				num2--;
			}while(num2 >=1);
			num1--;
		}while(num1 >=2);

	}

}
