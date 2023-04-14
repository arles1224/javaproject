package java1;

import java.util.*;

public class Array13 {
	// 입력된 값을 배열 데이터로 변환하는 방법
	public static void main(String[] args) {
		String list = "";
		Scanner scanner = new Scanner(System.in);
			System.out.println("학급 학생 이름을 입력해주세요.");
			list = scanner.nextLine();
		String data[] = list.split(" ");
		System.out.println(Arrays.toString(data));
		scanner.close();
	}

}
