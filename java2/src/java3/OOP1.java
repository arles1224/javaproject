package java3;

import java.text.DecimalFormat;
import java.util.*;

public class OOP1 {
	// 배열 : ArrayList,List,LinkedList,Map
	/*
	 * 응용문제1.
	 * 사용자가 금액을 8번 입력한 후에 최종 합계 금액을 출력하는 프로세스를 제작하시오.
	 * 예시)
	 * "입금할 금액을 입력하세요."
	 * 500
	 * ...
	 * 500 a b c d e f g
	 * "총 입금액은 x,xxx원 입니다.
	 */
	public static void main(String[] args) {
		Pro pro = new Pro();
		pro.process();
		pro.result();
	}
}
class Pro {
	Scanner scanner = new Scanner(System.in);  // Heap
	LinkedList<Integer> money = new LinkedList<>(); // Heap
	void process(){
		int ea = 0;
		int user = 0;
		while(true) {
			try {
				System.out.println("입금하실 금액을 입력하세요.");
				user = this.scanner.nextInt();
				this.money.add(user);
				ea = this.money.size();
				if(ea == 8) {
					break;
				}
			}
			catch(Exception e){
				System.out.println("문자는 입력하실 수 없습니다.");
				this.scanner.next(); 
				continue; // continue를 사용하면 다시 원상태로 돌아간다.
			}
		}
		this.scanner.close();
	}
	void result() {
		Integer result = 0;
		System.out.println(this.money);
		for(int a : this.money) {
			result += a;
		}
		DecimalFormat total = new DecimalFormat("###,###");
		total.format(result);
		System.out.println("총 입금액은 "+result+"원입니다.");
	}
}