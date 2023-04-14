package java1;

class Member{ // 외부 클래스
	String user = "홍길동"; // 인스턴스 변수
	public static void abc() { //void : return이 없는 메소드.
		String user2 = "이순신";
		System.out.println(user2);
	}
}

/*
 * [접근 제어자]
 *  public : 접근 제한이 없다.
 *  private : 오직 자신의 class 내에서만 접근할 수 있다.
 *  protected : 같은 package 안에서 생성된 class만 접근할 수 있다. 
 *  			만약 다른 package에 속한 class여도 해당 class의 자식 class면 접근할 수 있다.
 *  default : 접근 제어자를 사용하지 않은 경우. 같은 package 안에서만 접근할 수 있다.
 */

public class Class2 {
	// 외부 class 및 외부 method 활용
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Member m = new Member(); // 객체 생성
		System.out.println(m.user); // user2는 지역 변수이기 때문에 불러올 수 없다.
		m.abc(); // Member class 안의 abc() method를 호출.
		
		Inject i = new Inject(); // 객체 생성
		i.user("hong","a123456"); // 외부 메소드를 호출해 인자값 보내기
		
		// 응용문제 1.
		// 두 개의 숫자를 외부 class 안에 있는 메소드를 통해 곱하고 결과값이 짝수인지 홀수인지 검토하는 코드를 작성하시오.
		
		i.mtp(10, 3);
		
	}

}
class Inject {
	public void user(String name, String pw) { // user 메소드에 두 개의 인자값 및 자료형을 받는 형태
		System.out.printf("사용자명:%s 패스워드:%s\n",name,pw);
	}
	public static void mtp (int num1,int num2) {
		int sum = num1 * num2;
		if(sum%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}
}