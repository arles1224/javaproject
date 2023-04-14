package java3;

public class Interface3 {
	// User1.java, User2.java 응용편
	/*
	 * 응용문제2.
	 * 가입된 모든 사용자의 정보를 다음과 같이 출력합니다.
	 * 아이디 : hong 고객명 : 홍길동 : 이메일 : hong@nate.com 지역 : 서울시 영등포구
	 */
	public static void main(String[] args) {
		Inf3 inf3 = new Inf3();
		inf3.pointck("");
	}

}
class Inf3 implements User1, User2{
	// User1.userdata : 아이디, 이름, 이메일, 전화번호
	// User2.infodata : 아이디, 이름, 주소, 전화번호, 포인트
	
	// 인터페이스 필드들은 static이기 때문에 변수만 사용할 거라면, 상속시키지 않고 변수만 가져오는 것이 가능하다.
	// 메소드가 필요하지 않으면 interface를 상속시키지 않고 변수만 가져오면 된다.
	String[] sorting;

	@Override
	public String pointck(String userid) {
		this.sorting = new String[]{"아이디","고객명","이메일","지역"};
		int w= 0;
		String result = "";
		while(w < User1.userdata.length) {
			int w2 = 0;
			while(w2 < User1.userdata[0].length) {
				if(w2 != 3) {
					result += sorting[w2] + ":" + User1.userdata[w][w2]+"  ";
				}else {
					result += sorting[w2] + ":" + User2.infodata[w][2];
					System.out.println(result);
					result="";
				}
				w2++;
			}
			w++;
		}
		return null;
	}
	@Override // 사용 안 함
	public void myinfo(String userid) {}
	@Override // 사용 안 함
	public void mytel(String usertel) {}
}