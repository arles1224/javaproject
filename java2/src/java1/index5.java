package java1;

import java.util.Scanner;
//Library: java를 쉽게 사용할 수 있게 해주는 class들을 모아 놓은 것.
//Scanner: class의 일종. 사용자가 값을 입력할 수 있게 해준다.
public class index5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.in: 입력
		//System.out: 출력
		//new: Object를 선언하는 것.
		int a = 10;
		System.out.print("숫자를 입력하세요: ");
		int b = sc.nextInt(); // integer 자료형으로 입력 받는다.
		//String b = sc.next(); : String 자료형으로 입력 받는다.
		//double b = sc.nextDouble(); : double 자료형으로 입력 받는다.
		if(a > b) {
			System.out.println("업");
		}else if(a < b) {
			System.out.println("다운");
		}else {
			System.out.println("정답");
		}
		
		sc.close(); //모든 객체는 열었으면 사용 후에 종료 선언을 해준다. 닫지 않으면 메모리 누수가 발생한다.
	}

}
