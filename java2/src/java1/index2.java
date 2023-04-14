package java1;

public class index2 {

	public static void main(String[] args) {
		
		String user = "홍길동";
		byte level = 5;
		int point = 15000;
		//System.out.println(user+"님 "+"레벨은 "+level+" 포인트는 "+point+"점입니다.");
		System.out.printf("이름 : %s\n",user);
		System.out.printf("레벨 : %d\n",level);
		System.out.printf("포인트 : %d\n", point);
		
		//println : 개행 문자(\n)가 포함되어 있기 때문에 괄호 안의 내용을 출력한 후 한 줄 띄운다.
		//printf : %d, %s 등을 쓰기위해 사용한다. 개행문자가 포함 안 되어있기 때문에 한 줄 띄우지 않는다.
		
		boolean ck = true;
		System.out.println(!ck);
		System.out.printf("동의함 : %b", ck);
		
	}

}
