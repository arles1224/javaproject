package java2;

import java.util.Arrays;
import java.util.Base64;

// setter와 getter

public class Method8 {

	public static void main(String[] args) {
		Apple2 ap2 = new Apple2();
		ap2.userinfo(); // setter 실행
		ap2.myinfo(); // getter 값을 받아서 처리하는 메소드 실행
	}
}

class Apple1{
	private String userid = "";
	private String userpw = "";
	private String userpw2 = "";
	private String useremail = "";
	
	// setter : 변수에 데이터를 할당하는 역할을 한다. 세팅?
	public void userinfo() {
		this.userid = "kim";
		this.userpw = "a123456";
		// Base64.getEncoder() : 문자를 인코딩해준다.
		this.userpw2 = Base64.getEncoder().encodeToString(this.userpw.getBytes());
		this.useremail = "kim@naver.com";
	}
	
	// getter : 데이터를 return으로 내보내는 역할을 한다.
	public String[] user() {
		String[] data = new String[3];
		data[0] = this.userid;
		data[1] = this.userpw2;
		data[2] = this.useremail;
		return data;
	}
}

class Apple2 extends Apple1{ // class Subclass extends Superclass. apple2 inherits apple1.
	public void myinfo() {
		String[] list = this.user();
		System.out.println(Arrays.toString(list));
	}
}