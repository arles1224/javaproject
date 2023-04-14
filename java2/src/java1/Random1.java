package java1;

import java.util.Scanner;

public class Random1 {
	// random 메소드 사용법 + 재귀 메소드(스스로를 혹은 다른 메소드를 호출하는 메소드)
	public static void main(String[] args) {
		//double number = Math.random()*10;
		// Math.random() : 0부터 1까지의 무작위 실수 생성 -> Math.random*10 : 0부터 10까지 무작위 실수 생성
		// Math.ceil : 올림
		// Math.floor : 내림
		// Math.round : 반올림
		//System.out.println((int)Math.ceil(number));
		
		// 컴퓨터가 숫자 한 개를 생성하면 사용자가 그 숫자를 맞추는 게임.
		// 틀릴 경우 "실패"라고 출력하고 새로운 숫자를 생성한다.
		// 맞을 경우 "정답"이라고 출력하고 프로그램을 정지한다.
		game g = new game();
		g.pc();
	}

}

class game {
	int ai, person;
	Scanner scanner = new Scanner(System.in);
	void pc() {
		// this 활용법
		// this는 현재 class를 의미한다.
		ai = (int)Math.ceil(Math.random() * 5);
		System.out.print("1부터 5까지 숫자 중 하나를 입력하세요 : ");
		this.person = scanner.nextInt(); // 현재 클래스 안에 있는 person 변수를 의미한다.
		if(ai==person) {
			System.out.println("성공");
			this.scanner.close(); // 현재 클래스의 Scanner만 종료한다.
		}else {
			System.out.println("실패");
			this.pc(); // 현재 클래스 안의 pc() 메소드를 호출하라는 의미. 스스로를 호출하는 재귀함수이다.
		}
	}
}