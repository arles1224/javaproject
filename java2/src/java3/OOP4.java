package java3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class OOP4 {
	/*
	 * (주)이루온
	 * 해당 원시 배열 데이터를 이용해 추상 클래스에서 해당 결과값이 도출될 수 있도록 코드를 작성하시오.
	 * 회원 전체의 포인트 합계를 출력하시오 (abstract 사용)
	 *  ※추상 클래스 명은 Userinfo2입니다.
	 */
	public static void main(String[] args) {
		Op4 op4 = new Op4();
		op4.point();
	}

}
class Op4 extends Userinfo2{
	Integer sum = 0;
	ArrayList<String[]> userinfo;
	@Override
	public void point() {
		this.userinfo = new ArrayList<>(Arrays.asList(this.data));
		// System.out.println(userinfo.size());; // 총 배열 개수 11
		// System.out.println(Arrays.toString(userinfo.get(0))); // 배열 형식 
		int w = 0;
		while(w < this.userinfo.size()) {
			this.sum += Integer.parseInt(this.userinfo.get(w)[6]);
			w++;
		}
		DecimalFormat num = new DecimalFormat();
		System.out.println(num.format(sum));
	}
}