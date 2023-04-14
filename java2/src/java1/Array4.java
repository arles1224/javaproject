package java1;

public class Array4 {
	// 배열 범위 설정 및 값 추가하기
	public static void main(String[] args) {
		// 배열값이 5개인 a 객체를 생성.
		int a[] = new int[6];
		// 각 자리에 값을 할당.
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		a[3] = 20;
		a[4] = 25;
		// a[5]에는 값을 할당하지 않았다. 반복문에서 0으로 출력된다.
		// a[6]은 자리가 존재하지 않기 때문에 코드를 써도 작동하지 않는다.
		byte w = 0;
		while(w < a.length) {
			System.out.print(a[w]+" ");
			w++;
		}
		
		// 문자열 배열
		String user[] = new String[3];
		user[0] = "홍길동";
		user[1] = "강감찬";
		user[2] = "유관순";
		
		// 배열값 할당 단축코드
		//int number[] = new int[] {1,2,3,4,5};
	}

}
