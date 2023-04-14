package java1;

import java.util.Scanner;

public class index10 {

	public static void main(String[] args) {
		// for문 + Scanner
		// 응용문제2.
		// 숫자를 입력하면 해당 숫자에 맞는 구구단이 출력되도록 하시오.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원하는 구구단 숫자를 입력하세요 : ");
		byte num = scanner.nextByte();
		int f;
		//반복문은 루프문이기 때문에 그 위나 반복문 안에 close() 사용해야 정상적으로 Scanner 오브젝트가 종료된다.
		if(num > 1 && num < 10) {
			for(f=1;f<=9;f++) {
				System.out.printf("%d * %d = %d\n",num,f,num*f);
				scanner.close();
			}
		}else {
			System.out.println("2부터 9까지 숫자를 입력하세요.");
		}
		
	}

}
