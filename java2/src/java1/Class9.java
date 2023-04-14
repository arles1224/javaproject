package java1;

import java.util.Scanner;

public class Class9 {
	// 예약 시스템 구현
	public static void main(String[] args) {
		new Class9();

	}
	Class9(){
		String num = message("방번호를 입력하세요.\n1.무지개룸 2.패밀리룸 3.달빛아래룸\n","");
		switch(num){
		case "1" : price(60000);
		break;
		case "2" : price(125000);
		break;
		case "3" : price(100000);
		break;
		default : System.out.println("올바른 값이 아닙니다."); System.exit(0);
		break;
		}	
	}
	public void price(int p) {
		System.out.println("가격 : "+p);
		String sale = message("30% 할인 쿠폰을 적용하시겠습니까?(y/n)\n","y");
		double coupon = 0.3;
		if(sale.equals("y")) {
			message((int)Math.round(p*(1-coupon)));
		}else {
			message(p);
		}
		System.exit(0);
	}
	public String message(String msg1, String msg2) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(msg1);
		String result = scanner.next().intern();
		if(msg2.equals("y")) {
			scanner.close();
		}
		return result;
	}
	public void message(int p) {
		System.out.println("최종 가격은 "+p+"원입니다.");
	}
}
