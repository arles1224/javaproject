package example;

import java.util.*; // util 내부의 모든 라이브러리를 사용한다.

public class Example6 {
	Scanner scanner = new Scanner(System.in);
	Integer data[] = new Integer[10];
	public static void main(String[] args) {
		Example6 array = new Example6();
		array.abc();
	}
	
	public void abc() {
		System.out.println("숫자 10개를 입력하세요.");
		String a = scanner.nextLine();
		String r[] = a.split(" ");
		if(r.length == 10) {
			int w = 0;
			while(w < r.length) {
				this.data[w] = Integer.parseInt(r[w]);
				w++;
			}
		}else {
			System.out.println("숫자는 10개만 입력 가능합니다.\n");
			abc();
		}
		
		Arrays.sort(this.data);
		System.out.println(Arrays.toString(this.data));
	}
}
