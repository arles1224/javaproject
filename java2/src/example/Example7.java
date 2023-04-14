package example;

import java.util.*;

public class Example7 {
	// 응용문제 3.
	// 사용자가 총 7개의 숫자를 입력했을 때 그 중 짝수값이 몇 개인지 출력하시오.
	// 또한 최종 Integer 배열값도 출력합니다.
	
	Scanner scanner = new Scanner(System.in);
	Integer data[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example7 ex = new Example7();
		ex.custom();
	}
	
	void custom() {
		System.out.println("숫자 7개를 입력하세요.");
		String a = scanner.nextLine();
		String b[] = a.split(" ");
		if(b.length == 7) {
			data = new Integer[b.length];
			int w = 0;
			int c = 0;
			while(w < b.length) {
				data[w] = Integer.parseInt(b[w]);
				if(data[w]%2 == 0) {
					c++;
				}
				w++;
			}
			System.out.println("배열 : "+Arrays.toString(data)+", 짝수 : "+c+"개");
			scanner.close();
		}else{
			System.out.println("숫자 7개를 입력하셔야 합니다.\n");
			custom();
		}
	}
	
//	public void result() {
//		System.out.println("7개의 숫자를 입력하세요.");
//		int w = 0;
//		int count = 0;
//		do{
//			Integer user = scanner.nextInt();
//			if(user % 2 == 0) {
//				count++;
//			}
//			this.data[w] = user;
//			w++;
//		}while(w < 7);
//		System.out.printf("베열 정보 : %s, 총 짝수 개수 : %d",Arrays.toString(this.data),count); //
//	}
}
