package java3;

import java.text.DecimalFormat;

public class Exception4 {
	// 예외처리문 응용편
	/*
	 * "hong3000","park1250","kang852","kim1819","lee5117"
	 * 전체 포인트 합계를 출력하는 프로세스를 구축하시오.
	 */
	public static void main(String[] args) {
		String[] user = {"hong3000","park1250","kang852","kim1819","lee5117"};
		Ex ex = new Ex();
		String[] ruser = new String[user.length];
		int i;
		for(i=0;i<user.length;i++) {
			ruser[i] = user[i].replaceAll("[a-zA-Z]","");
		}
		try {
			ex.total(ruser);
		}catch(Exception e) {
			if(e.getMessage() != null) {
				System.out.println(e);
			}
		}		
	}

}
class Ex{
	public void total(String[] data) throws Exception {
		DecimalFormat num = new DecimalFormat();
		int i;
		int sum = 0;
		for(i=0;i<data.length;i++) {
			sum += Integer.valueOf(data[i]);
		}
		System.out.println("전체 포인트는 "+num.format(sum)+"점입니다.");
	}
}