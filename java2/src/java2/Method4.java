package java2;

public class Method4 {
	// private 접근자 객체 선언2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert insert = new Insert();
		insert.userid = "hong"; // 아이디
		String member_key = "123456"; // 보안키
		String msg = insert.checks(member_key); // checks 메소드에서 return을 받아 결과값 확인
		if(msg == "ok") {
			System.out.print("정상적인 접근입니다.");
		}else {
			System.out.print("올바른 접근이 아닙니다.");
		}
	}

}
class Insert{
	String userid = null;
	private String key = "memberok"; // 해당 class에서만 접근할 수 있다.
	public String checks(String userkey) { // main으로부터 인자값으로 보안키 받음
		String call;
		if(userkey == key) { // 받은 보안키 비교
			call = "ok";
		}else {
			call = "error";
		}
		return call;
	}
}