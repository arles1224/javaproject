package files;

import java.io.FileWriter;
import java.util.Scanner;

public class File5 {
	/*
	 * user.txt라는 파일에 다음과 같이 저장되도록 코드를 작성하시오.
	 * 사용자 아이디를 입력하라는 문구가 총 5번 출력되며, 사용자가 직접 아이디를 입력한다.
	 * 사용자가 입력한 내용은  user.txt에 남아있어야 한다.
	 */
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		FileWriter fw = new FileWriter("E:\\git_java\\javaproject\\java2\\src\\files\\user.txt");
		int i = 0;
		while(i <=5) {
			System.out.println("사용자 아이디를 입력하세요.");
			String id = scanner.next();
			fw.write(id);
			if(i < 4) {
				fw.write(", ");
			}
			i++;
		}
		System.out.println("아이디 입력 종료.");
		scanner.close();
		fw.close();
	}

}
