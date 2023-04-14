package java1;

import java.math.BigInteger; //BigInteger class load

public class index12 {

	public static void main(String[] args) {
		// Big_loop 값 설정
		//1부터 100까지 모든 숫자를 곱한 값을 출력하는 방법.
		//결과값이 long의 범위도 초과한다.
		int w = 1;
		BigInteger sum = new BigInteger("1");
		//BigInteger : Java에서 유일하게 무한의 값을 가질 수 있는 자료형.
		//최초의 값은 무조건 문자로 설정된다.(위의 경우에 "1")
		//add : 더하기, subtract : 빼기, multiply : 곱하기, divide : 나누기
		while(w <= 100) {
			sum = sum.multiply(BigInteger.valueOf(w));
			w++;
		}
		//System.out.print(sum);
	}

}
