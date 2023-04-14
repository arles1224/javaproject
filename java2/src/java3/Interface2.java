package java3;
//import java.text.DecimalFormat;
// http://mekeyace.dothome.co.kr/userdb.txt
// User1.java, USer2.java 연계
import java.util.*;

public class Interface2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("사용자 아이디를 입력하세요.");
		String id = scanner.next();
		Userinfoo ui = new Userinfoo();
		ui.pointck(id);
		
		scanner.close();
	}

}
// 사용자의 포인트를 확인하는 프로세스
class Userinfoo implements User1, User2{
	//User1.userdata : 아이디, 이름, 이메일, 전화번호
	//USer2.infodata : 아이el, 이름, 주소, 전화번호, 포인트
	//private int total;
	@Override
	public void myinfo(String userid) {
		
	}
	@Override
	public String pointck(String userid) {
//		this.total = dataea();
//		String point = null;
//		int count = 0;
//		// 데이터 로드 부하를 줄이기 위해 사용.
//		try {
//			System.out.println("조회중...");
//			Thread.sleep(500);
//		}catch(Exception e) {
//			
//		}
//		int w = 0;
//		while(w < total) {
//			if(userid.equals(User2.infodata[w][0])) {
//				point = User2.infodata[w][4];
//				count++;
//				break;
//			}
//			w++;
//		}
//		if(count == 0) {
//			System.out.println("등록된 회원이 아닙니다.");
//		}else {
//			DecimalFormat df = new DecimalFormat("###,###");
//			System.out.printf("고객님의 포인트는 %s점입니다.",df.format(Integer.parseInt(point)));
//		}
		return null;
	}
	@Override
	public int dataea() {
		return User1.super.dataea();
	}
	@Override // 사용 안 함
	public void mytel(String usertel) {}
}