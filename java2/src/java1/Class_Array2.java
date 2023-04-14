package java1;

import java.util.Scanner;

public class Class_Array2 {
	// 두 개의 배열 - scoring.java와 연계
	// 응용문제 2.
	// "검색하시려는 이름을 적어주세요 : "라고 출력한 뒤 이름을 입력받습니다.
	// 검색한 이름이 있을 경우 "ㅇㅇㅇ님은 00점입니다."라고 출력되도록 합니다.
	// scoring은 배열에 있는 데이터를 검색하는 용도로만 사용합니다.
	public static void main(String[] args) {
		String a1[] = {"홍길동","이순신","강감찬","유관순","김유신"};
		String a2[] = {"100","80","39","42","55"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색하시려는 이름을 적어주세요 : ");
		String name = scanner.next().intern(); // 사용자 입력
		scanner.close();
		
		scoring score = new scoring(); // 외부 class 객체 생성
		int n = score.scr(a1,a2,name); // 해당 메소드로 인자값 3개 전달
		if(n != a1.length) {
		System.out.printf("%s 님은 %s점입니다.",a1[n],a2[n]);
		}else {
			System.out.println("존재하지 않는 이름입니다.");
		}

	}

}
