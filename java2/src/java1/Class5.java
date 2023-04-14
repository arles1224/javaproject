package java1;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Member2 member2 = new Member2();
		member2.list("홍길동", 5);
		
		// 응용문제 5.
		// Member2 Class 안에 신규 method를 생성해 사용자에게 구구단 숫자를 입력 받아 다음과 같이 결과를 출력하시오.
		// 예시)
		// "사용하실 구구단 숫자를 한 개 입력하세요."
		// -> 해당 구구단을 역순으로 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("사용하실 구구단 숫자를 한 개 입력하세요.");
		int num = scanner.nextInt();
		member2.gg(num);
		scanner.close();
	}

}
class Member2 {
	public void list(String user, int level) {
		// 인자값은 여러가지 자료형으로 받을 수 있지만 return은 한 가지 자료형만 반환할 수 있다.
		System.out.printf("고객명:%s 레벨:%d\n",user,level);
		
	}
	
	void gg (int n) {
		byte w = 9;
		if( n > 1 && n <= 9) {
			while(w >= 1) {
				System.out.printf("%d * %d = %d\n",n,w,n*w);
				w--;
			}
		}else {
			System.out.println("2부터 9까지 숫자를 입력하세요.");
		}
	}
}