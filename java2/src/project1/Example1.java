package project1;

import java.util.*;

public class Example1 {
	/*
	 * (주)데브시스터즈 면접
	 * 응용문제 4.
	 * 다음 업, 다운 퀴즈 프로세스를 제작하시오.
	 * 컴퓨터가 1부터 10까지에서 임의의 숫자를 선택합니다.(interface 적용)
	 * "1부터 10까지 숫자를 입력하세요."라는 메세지 출력 후 사용자가 숫자를 한 개 선택합니다.
	 * 
	 * 사용자가 PC보다 큰 숫자를 선택하면 "DOWN"을, 작은 숫자를 선택하면 "UP"을 출력합니다.
	 * 횟수 제한은 4번이며, 사용자가 컴퓨터와 같은 숫자를 고르면 "정답"을, 4회까지 맞추지 못하면
	 * "정답을 맞추지 못했습니다."를 출력합니다.
	 */
	public static void main(String[] args) {
		Pro pro = new Pro();
		pro.com();
	}

}
class Pro implements Com{
	Integer cnum;
	Integer unum;
	Integer count = 1;
	Scanner scanner = new Scanner(System.in);
	@Override
	public void com() {
		this.cnum = (int)Math.ceil(Math.random()*10);
		number();
	}
	@Override
	public void number() {
		try {
			msg("1부터 10까지 숫자 한 개를 입력하세요");
			this.unum = scanner.nextInt();
			if(this.unum > 10 || this.unum < 1 ) {
				msg("숫자는 1부터 10까지 입력하실 수 있습니다.");
				number();
			}else if (this.unum >= 1 && this.unum <=10) {
				if(this.count < 4) {
					check(this.cnum,this.unum);
				}else if(this.count >= 4) {
					msg("정답을 맞추지 못했습니다.");
				}
			}
		}
		catch(Exception e) {
			msg("숫자만 입력하세요");
		}
	}
	@Override
	public void msg(String m) {
		System.out.println(m);
	}
	@Override
	public void check(Integer com, Integer user) {
		if(com == user) {
			msg("정답");
		}else if(com > user) {
			msg("UP");
			count++;
			number();
		}else {
			count++;
			msg("DOWN");
			number();
		}
	}
}