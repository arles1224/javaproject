package java1;

import java.util.*;

public class Array6 {
	// 배열 + 키오스크 응용
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 반복문 강제 종료 방법
//		int a = 1;
//		while(a <=5) {
//			System.out.print("선택하세요");
//			int b = scanner.nextInt();
//			if(b==0) { // 사용자가 숫자 0을 입력하면 break이 작동하면서 반복문 강제 종료.
//				System.out.print("종료");
//				break;
//			}
//			a++;
//		}
		/*
		 * 응용문제 5.
		 * "주문하시려는 메뉴를 선택해주세요."라고 메세지 출력 후 입력 받는 메뉴 리스트를 출력하시오.
		 * 주문 종료를 선택 했을 때만 주문한 음식 리스트가 나와야 합니다.
		 * 메뉴 : 햄버거, 피자, 치킨, 라면, 김밥, 커피
		 * 출력 예시)
		 * "주문하시려는 메뉴를 선택해주세요."
		 * "1. 햄버거 2. 피자 3. 치킨 4. 라면 5. 김밥 6. 커피 7. 주문 종료"
		 * [치킨,라면,햄버거,null,null,null]
		 */
		
		String menu[] = {"햄버거","피자","치킨","라면","김밥","커피","주문종료"};
		String food[] = new String[menu.length];
		Array6 a = new Array6();
		int w, s, count;
		w = s = count = 0;
		while(w < menu.length) {
			System.out.println("주문하시려는 메뉴를 선택해주세요.\n1.햄버거 2.피자 3.치킨 4.라면 5.김밥 6.커피 7.주문종료");
			s = scanner.nextInt();
			if(s != 7) {           
				food[w] = menu[s-1];
				count++;
			}else {
				a.test(count, food);
				break;
			}
			w++;
		}
		scanner.close();
	}
	
	public void test(int n, String food[]) {
		String[] t =  new String[n];
		int t1 = 0;
		while(t1 < n) {
			t[t1] = food[t1];
			t1++;
		}
		System.out.println("메뉴 선택을 완료하셨습니다.\n"+Arrays.toString(t));	
	}
}
