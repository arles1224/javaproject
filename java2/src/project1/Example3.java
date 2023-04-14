package project1;

import java.util.*;

public class Example3 {
	/*
	 * (주)CJ운송
	 * 사용자 8명이 있을 때, 각각의 사용자에게 포인트를 주어야 한다.
	 * 다음 결과처럼 나오도록 코드를 작성하시오.
	 * customer data : 서울 경기도 인천 대전 충북 충남 전북 전남
	 * "서울 님에게 포인트 추가하시겠습니까?"
	 * ...
	 * "전남 님에게 포인트 추가하시겠습니까?"
	 * 무조건 숫자만 입력 받으며 숫자 외에 입력시 "포인트는 숫자만 입력 가능합니다."라고 출력합니다.
	 * 문자로 입력해 오류가 발생하면 "ㅇㅇ 님에게 포인트 추가하시겠습니까?" 질문이 나와야 합니다.
	 * 
	 * 최종 결과 정보
	 * 서울 : 500
	 * 경기도 : 300
	 * 인천 : 300
	 * ...
	 */
	public static void main(String[] args) {
		Point point = new Point();
		point.point();
	}

}
class Point{
	Scanner scanner = new Scanner(System.in);
	String[] cs;
	Integer count = 0;
	Map<String, Integer> pcs = new HashMap<>();
	public void point() {
		this.cs = new String[] {"서울","경기도","인천","대전","충북","충남","전북","전남"};
		while(true) {
			try {
				if(count < cs.length) {
				String name = test(count);
				msg(name +" 님에게 포인트 추가하시겠습니까?");
				int point = scanner.nextInt();
				pcs.put(name,point);
				count++;
				}else {
					scanner.close();
					break;
				}
			}catch(Exception e){
				msg("포인트는 숫자만 입력 가능합니다.");
				scanner.next();
				continue;
			}
		}
		for(String a : cs) {
			System.out.println(a+" : "+pcs.get(a));
		}
	}
	public void msg(String msg) {
		System.out.println(msg);
	}
	public String test(int num) {
		return this.cs[num];
	}
}