package java2;

import java.util.Arrays;

public class Method5 {
	// private 관련 사항 (변수 설정) + 배열값 추가
	public static void main(String[] args) {
		apink a = new apink();
		a.test();
	}

}
class apink{
	private String user[] = {"1","2","3","4","5"};
	public void test() {
		// 로컬 변수는 접근 제어자를 사용할 수 없다.
		// 데이터 추가를 위해 신규 배열을 만들고 반복문을 사용해 기존 배열값을 복사한 다음에 데이터를 추가했다.
		String user2[] = new String[this.user.length+1];
		int w = 0;
		while(w < this.user.length) {
			user2[w] = this.user[w];
			w++;
		}
		user2[5] = "6";
		System.out.println(Arrays.toString(user2));
	}
	
}