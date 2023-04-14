package project1;

import java.util.Scanner;

public class Example1_teacher {

	public static void main(String[] args) {
		Games games = new Games();
		games.user();
	}

}
class Games implements Game{
	Scanner sc;
	int count = 1;
	@Override
	public void user() {
		sc = new Scanner(System.in);
		System.out.println("1부터 10까지 숫자를 입력하세요.");
		int my = sc.nextInt();
		if(my > 10) {
			System.out.println("10 이하의 숫자만 입력하세요.");
			user();
		}else {
			count++;
			if(count > 4) {
				System.out.println("정답을 맞추지 못했습니다.");
			}else {
				String z= result(Game.pc, my);
				if(z.equals("")) {
					System.out.println("정답입니다.");
				}else {
					System.out.println(z);
					user();
				}
			}
		}
		
	}
	@Override
	public String result(int pc, int user) {
		String msg = "";
		if(pc > user) {
			msg = "UP";
		}else if(pc < user) {
			msg = "DOWN";
		}
		return msg;
	}
}