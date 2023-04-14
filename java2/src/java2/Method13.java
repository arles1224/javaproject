package java2;

import java.util.*;

public class Method13 {
	
	// 응용문제1.
	// 사용자가 구구단 숫자 하나를 입력했을 때, 세컨 개발자가 입력된 사항에 대해 1부터 9까지 결과가 출력되는 구구단 프로세스를 개발합니다.
	// 단, 상속 받은 메소드에서 처리되도록 코드를 작성하시오.
	public static void main(String[] args) {
		Gprocess gp = new Gprocess();
		gp.gugu();
	}

}
class Gugudan{
	protected int number;
	Scanner scanner = new Scanner(System.in);
	public void gugu() {
		System.out.println("검색할 구구단을 입력하세요.");
	}
	public void result() {
		
	}
}
class Gprocess extends Gugudan{
	@Override
	public void gugu() {
		super.gugu();
		this.number = scanner.nextInt();
		scanner.close();
		result();
	}
	@Override
	public void result() {
		Integer w = 1;
		Integer result = 0;
		while(w <= 9) {
			result = w * this.number;
			System.out.printf("%d * %d = %d\n",this.number,w,result);
			w++;
		}
	}
}