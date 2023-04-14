package java1;

import java.util.*;

public class Array7 {
	// 배열 생성 응용편
	public static void main(String[] args) {
		// 응용문제 6.
		// 사용자가 상품을 검색했을 때 검색한 내용을 배열로 저장하시오.
		// 예시)
		// 상품 검색 : 선풍기
		// 상품 검색 : 냉장고
		// 상품 검색 : 모니터
		// 상품 검색 : 검색종료
		// [선풍기, 냉장고, 모니터, null, null, null, null]
		
		Scanner scanner = new Scanner(System.in);
		String[] product = new String[7];
		int w = 0; 
		String nm = ""; 
		while(w < product.length) {
			System.out.print("상품 검색 : ");
			nm = scanner.nextLine(); // 상품명은 띄어쓰기 할 수도 있기 때문에 nextLine 써야 한다.
			if(!nm.equals("검색종료")) {
				product[w] = nm;
			}else {
				break;
			}
			w++;
		}
		// Arrays.toString : 배열 내용을 출력하는 함수.
		// 그냥 product.toString() 했을 때 나오는 건 배열 주소이다.
		System.out.println(Arrays.toString(product));
		scanner.close();
	}

}
