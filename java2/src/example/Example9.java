package example;

import java.util.*;

public class Example9 {
	// 응용문제 4.
	// 자판기 프로세스 구현.
	// 다음과 같이 작동되도록 코드를 작성하시오.
	// "금액을 입력하세요 : " 출력 후 "메뉴를 선택하세요.'배열'"을 출력합니다.
	// 최종적으로 "잔돈은 xx원입니다."라고 출력합니다.
	String data[][] = {
			{"코카콜라","스프라이트","환타","코코팜"},
			{"500","500","600","800"}
	};
	
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Example9 ex = new Example9();
		ex.process();
	}
	
	void process() {
		System.out.println("투입하실 금액을 입력하세요.");
		Integer money = scanner.nextInt();
		System.out.printf("메뉴를 선택하세요.\n%s\n",Arrays.toString(data[0]));
		scanner.nextLine();
		String name = scanner.nextLine();
		Integer result = 0;
		int w = 0;
		while(w < data[0].length) {
			if(name.equals(data[0][w])) {
				result = money - Integer.parseInt(data[1][w]);
			}
			w++;
		};
		System.out.printf("선택하신 메뉴는 %s, 잔돈은 %d원입니다.",name,result);
		scanner.close();
	}
}
