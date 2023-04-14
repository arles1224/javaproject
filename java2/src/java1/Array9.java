package java1;

//import java.util.Arrays;

public class Array9 {
	// 2차 배열 구조 및 출력
	/*
	 * 동적 배열 : 크기를 동적으로 할당한다.
	 * 동적 배열은 데이터의 추가나 삭제가 용이하며, 정적 배열보다 유연성이 높다. 
	 * 하지만 동적 배열은 정적 배열보다 메모리 사용량이 크기 때문에 대량의 데이터를 처리할 때 성능이 저하될 수 있다.
	 * int a[] = {1,2,3};
	 * int[] a = {1,2,3};
	 * int[]a = new int[]{1,2,3};
	 * 
	 * ArrayList<Integer> dynamicArray = new ArrayList<Integer>();
	 * ArrayList 클래스를 사용해서 동적 배열을 선언하면 자동으로 배열의 크기가 조절된다.
	 * 
	 * 정적 배열 : 크기가 고정되어 있으며 선언할 때 배열의 크기를 지정해야 한다.
	 * int a[] = new int[3];
	 */
	
	// 프론트엔드에서 백엔드로 동적 배열 전달 : get 사용
	// 파라미터 형태 : a1=10,20,30,40,50
	// 프론트엔드에서 백엔드로 정적 배열 전달 : get 사용
	// 파라미터 형태 : a1=10&a2=10&a3=15&a4=20
	public static void main(String[] args) {
		String member[][] = {
				{"홍길동","김유신","유관순"},
				{"25","31","22"}
		};
//		System.out.println(Arrays.toString(member[0]));
//		System.out.println(Arrays.toString(member[1]));
//		System.out.println(member[0][2]);
		int i, w;
		for(i = 0; i <member.length;i++) {
			w = 0;
			while(w < member[0].length) {
				System.out.println(member[i][w]);
				w++;
			}
		}
	}

}
