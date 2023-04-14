package project1;

import java.text.DecimalFormat;
import java.util.*;

// 배열 데이터 url : http://mekeyace.dothome.co.kr/product_db.txt
public class Array4 {
	/*
	 * 한국방송공사
	 * 
	 * 응용문제 2.
	 * 해당 상품 리스트의 데이터는 차례로
	 * 상품 코드, 상품명, 상품 가격입니다.
	 * 
	 * 사용자가 상품을 선택했을 때 해당 상품은 장바구니 배열에 추가되어야 하며, 상품의 충 금액을 출력합니다.
	 * 단, 상품은 중복 입력할 수 있고, 장바구니는 최대 6개까지 담을 수 있습니다.
	 */
	public static void main(String[] args) {
		Process process = new Process();
		process.cart();
	}

}
class Process {
	ArrayList<Object[]> product;
	Scanner scanner = new Scanner(System.in);
	ArrayList<Integer> sales = new ArrayList<>();
	Integer EA;
	public void cart() {
		Object prm[][] = {
			{1,"니베아 데오드란트",35000},
			{2,"파스퇴르 바른목장",17000},
			{3,"해남 꿀고구마",15300},
			{4,"프리미엄 생 칵테일 새우",22370},
			{5,"쉬슬러 고농축 액체세제",16620},
			{6,"믹시 삐삐 미니캐리어",99500}
		};
		
		this.product = new ArrayList<>(Arrays.asList(prm)); 
		Integer sale = 0;
		while(true) {
			int w = 0;
			String msg = "제품을 선택해주세요.(종료하시려면 '종료'를 입력해주세요)\n";
			while(w < this.product.size()) {
				msg += (int)this.product.get(w)[0] +". " + String.valueOf(this.product.get(w)[1])+" ";
				w++;
			}
			System.out.println(msg);
			String select = this.scanner.next();
			switch(select) {
			case "1" : sale = (int)this.product.get(0)[2];
				break;
			case "2" : sale = (int)this.product.get(1)[2];
			break;
			case "3" : sale = (int)this.product.get(2)[2];
			break;
			case "4" : sale = (int)this.product.get(3)[2];
			break;
			case "5" : sale = (int)this.product.get(4)[2];
			break;
			case "6" : sale = (int)this.product.get(5)[2];
			break;
			case "종료" : sale = 0;
			break;
			default : 
				System.out.println("올바른 값을 입력해주세요.");
			continue;
			}
			this.sales.add(sale);
			int ea = this.sales.size();
			if(ea == 6 || select.equals("종료")) {
				this.scanner.close();
				sum(ea);
				break;
			}
		}
	}
	public void sum(int ea) {
		DecimalFormat num = new DecimalFormat();
		int w = 0;
		Integer total = 0;
		while(w < ea) {
			total += this.sales.get(w);
			w++;
		}
		System.out.println("총 가격은 " + num.format(total)+"원입니다.");
	}
}