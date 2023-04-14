package java2;

import java.util.Arrays;

public class Method2 {
	// return값을 이용한 메소드
	public static void main(String[] args) {
		test2 t = new test2();

		// 두 개 이상의 데이터를 하나의 문자열로 합친 상태로 받아 split으로 각각의 데이터로 다시 나눈다.
		String data1 = t.userinfo1();
		String[] info1 = data1.split(",");
		System.out.println(Arrays.toString(info1));
		
		
		String[] data2 = t.userinfo2();
		System.out.println(Arrays.toString(data2));

	}

}
class test2{
	String user_name = "홍길동"; // 인스턴스 변수
	String user_id = "hong";
	
	public String userinfo1() {
		// 로컬 변수
		String user_info = user_name + "," + user_id; // 하나의 문자열로 합쳐 두 개의 데이터를  return으로 보낸다
		return user_info;
	}
	public String[] userinfo2() { // 배열로 return하는 메소드
		String[] user_info = {user_name, user_id};
		return user_info;
	}
}