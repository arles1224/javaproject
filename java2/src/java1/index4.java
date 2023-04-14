package java1;

public class index4 {

	public static void main(String[] args) {
		// 반복문 사용.
		int f;
		for(f=1;f<=10;f++) {
			//System.out.println(f);
		}
		
		//더블 for문
		int a,b;
		for(a=2;a<10;a++) {
			for(b=1;b<10;b++) {
				//System.out.printf("%d*%d=%d\n",a,b,(a*b)); //순서를 이렇게 정해주는 거구나.
			}
		}
		
		//응용문제 2.
		//숫자 45부터 60까지를 총 합산한 결과값을 출력하시오.
		int num;
		int sum = 0;
		for(num=45;num<=60;num++) {
			sum += num;
		}
		System.out.println(sum);
		
		//응용문제 3.
		//1부터 200까지 숫자 중 홀수값만 모두 더한 결과값을 출력하시오.
		int odd;
		int sum2 = 0;
		for(odd=1;odd<=200;odd++) {
			if(odd%2==1){
				sum2 += odd;
			}
		}
		System.out.println(sum2);
		
		//응용문제 4.
		//20에서 60까지 숫자 중 3의 배수만 모두 더한 후 짝수인지 홀수인지를 출력하시오.
		int a3;
		int sum3 = 0;
		for(a3=20;a3<=60;a3++) {
			if(a3%3==0) {
				sum3 += a3;
			}
		}
		if(sum3%2==0) {
			//System.out.println("짝수입니다.");
		}else {
			//System.out.println("홀수입니다.");
		}
		
		//응용문제 5.
		//구구단 7단부터 3단까지 역순으로 결과값이 홀수인 것만 출력하시오.
		int b1, b2, sum4;
		for(b1=7;b1>=3;b1--) {
			for(b2=9;b2>=1;b2--) {
				sum4 = b1*b2;
				if(sum4%2==1) {
					//System.out.printf("%d*%d=%d\n",b1,b2,sum4);
				}
			}
		}
	}

}
