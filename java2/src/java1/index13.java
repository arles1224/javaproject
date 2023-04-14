package java1;

import java.text.SimpleDateFormat;
import java.util.*;
//모든 자바 utility에 있는 class 로드. 속도에 영향을 미치지 않는다.

//java.util.Date;
//java.sql.Date : 데이터베이스 관련 Date

//JAVA : OOP(Object Oriented Programming) 객체지향언어
//JavaScript : OOP 스크립트 언어

public class index13 {

	public static void main(String[] args) {
		// 날짜 출력 형태
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy년 MM월 dd일"); //m과 M도 다르다.
		SimpleDateFormat time = new SimpleDateFormat("HH시 mm분 s초");// h와 H는 다르다.(12시간/24시간)
		SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat date2 = new SimpleDateFormat("a hh:mm:ss"); // a: 오전, 오후 표시.
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		System.out.println(datetime.format(today));
		System.out.println(date2.format(today));
		
		//회원가입 할 때, 결제할 때 등등 사용한다.
	}

}
