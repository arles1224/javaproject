package java2;

public class Over3 {
	// 응용문제4.
	// 각 통신사 별 인원수 현황을 출력하는 프로세스를 개발하시오.
	// 결과)
	// SKT : 1명
	// KT : 2명
	// LGT : 1명
	// 메인 실행 // class : Over1, method : userlist(String)
	public static void main(String[] args) {
		Pdata pdata = new Pdata();
		pdata.userlist("");
	}

}
class Pdata extends Over1{
	@Override
	public void userlist(String name) {
		int sc, kc, lc;
		sc = kc = lc = 0;
		int w = 0;
		while(w < this.list.length) {
			if((this.list[w][4]).equals("SKT")) {
				sc++;
			}else if((this.list[w][4]).equals("KT")) {
				kc++;
			}else if((this.list[w][4]).equals("LGT")) {
				lc++;
			}
			w++;
		}
		System.out.printf("SKT : %d명\nKT : %d명\nLGT : %d명",sc,kc,lc);
	}
}