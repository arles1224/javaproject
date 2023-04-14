package java3;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {
	// 무한 루프 코드 작성
	public static void main(String[] args) {
		// for(;;) {} // for문 무한루프
		// 무한 루프를 사용하는 이유 : DB의 전체 데이터의 개수를 정확하게 파악하기 힘들기 때문이다.
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>(); // 빈 배열 생성
		Integer no; // 사용자가 입력한 숫자를 저장하기 위한 변수
		while(true) {
			System.out.println("숫자를 입력해주세요.");
			no = scanner.nextInt();
			al.add(no); // 빈 배열에 사용자가 입력한 숫자를 추가.
			int ea = al.size(); // 배열의 크기를 반복적으로 확인.
			if(ea >= 10) { // 배열의 크기가 10개 이상일 때 반복문 강제 정지
				break;
			}
		}
		System.out.println(al);
		scanner.close();
	}

}