package java3;

public class Exception5 {

	public static void main(String[] args) {
		Ex2 ex2 = new Ex2();
		try {
			ex2.loader("ok");
		}catch(Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
	}

}
class Ex2{
	public void loader(String a) throws Exception{
		// throw를 사용하면 해당 메소드의 오류도 자신을 호출한 메소드로 전달한다.
		// 해당 메소드의 오류를 직접 확인하기 위해서는 try-catch문을 사용해야 한다.
		try {
			if(a == "ok") {
				String data = "1,000";
				int money = Integer.valueOf(data);
				System.out.println(money);
			}else {
				System.out.println("올바른 데이터가 아닙니다.");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}