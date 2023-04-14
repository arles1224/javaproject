package example;

import java.util.*; // 라이브러리 호출
import java.text.SimpleDateFormat;

// 라이브러리는 부가적인 기능의 모임이다.

public class Example4 {
	Scanner scanner = new Scanner(System.in);
	Date date = new Date();
	SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd");
	SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
	int array[] = {1,2,3};

	public static void main(String[] args) {
		Example4 date = new Example4();
		date.print();

	}
	
	public void print() {
		System.out.println(sd.format(date));
		System.out.println(time.format(date));
	}
}
