package java1;
//[Scanner class 활용법]
import java.util.Scanner;

public class index6 {

	public static void main(String[] args) {
		//숫자 형태 스캐너
		Scanner a = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = a.nextInt();
		System.out.printf("입력하신 나이는 %d 세입니다. \n",age);	
		
		//문자 형태 스캐너
		Scanner b = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = b.next();
		System.out.printf("고객명은 %s입니다.",name);
		
		a.close();
		b.close();
	}

}
