package java1;

public class Array5 {

	public static void main(String[] args) {
		// 응용문제 3.
		// 배열 데이터를 모두 합한 결과를 출력하시오.
		// 15 60 11 14 27 -> 127
		int[] a = {15, 60, 11, 14, 27};
		int sum, w;
		sum = w = 0;
		while(w<a.length) {
			sum += a[w];
			w++;
		}
		System.out.println(sum);
		for(int f: a) { // 배열 전용 반복문
			//System.out.print(f);
			sum += f;
		}
		
		String id[] = {"hong","kim","park","lee","jang","jung"};
		// 응용문제 4.
		// 아이디 데이터 중 4글자 이상인 것만 출력하시오.
		int d = 0;
		do {
			if(id[d].length() >= 4) {
				System.out.println(id[d]);
			}
			d++;
		}while(d < id.length);
		for(String nm : id) { // 배열 전용 반복문
			if(nm.length() >= 4) {
				System.out.println(nm);
			}
		}
	}

}
