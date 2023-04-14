package java1;

import java.util.Scanner;

public class index9 {

	public static void main(String[] args) {
		//한 줄 이상 텍스트 입력 방법 및 구분자로서의 공백
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("두 개의 숫자를 입력하세요.");
		 int a1 = scanner.nextInt();
		 int a2 = scanner.nextInt();
		 //스페이스바, 엔터 모두 구분자로 사용할 수 있다.
		 System.out.printf("첫 번째 숫자 %d, 두 번째 숫자 %d \n",a1,a2);
		 
		 System.out.println("두 분의 이름을 입력하세요.");
		 String name1 = scanner.next();
		 String name2 = scanner.next();
		 System.out.printf("첫 번째 이름 %s, 두 번째 이름 %s \n", name1, name2);
		 
		 /*
		  * 위에서 next() 메소드를 쓰다가 nextLine() 메소드를 사용하는 경우나 그 반대에도 객체를 새로 생성해야 한다.
		  */
		 Scanner line = new Scanner(System.in);
		 System.out.println("주소를 입력하세요.");
		 String address = line.nextLine();
		 //nextLine() : 스페이스바를 구분자로 사용하지 않는다.
		 System.out.println("주소 : " + address);
		 scanner.close();
		 line.close();

	}

}
