package java1;

public class Class4 {

	public static void main(String[] args) {
		// 응용문제 4.
		// static이 없는 외부 class에 두 개의 숫자를 인자값으로 보내서 두 숫자 범위 안의 모든 값을 더해 결과값을 출력하는 코드를 작성하시오.
		Number number = new Number();
		int result = number.sum(38, 17);
		System.out.println(result);

	}

}
class Number{
	// 같은 package 안에서는 class 이름이 겹치면 안 된다.
	int sum(int num1,int num2) {
		int s,e;
		int result = 0;
		if(num1 <= num2) {
			s = num1;
			e = num2;
		}else{
			s = num2;
			e = num1;
		}
		while(s <= e) {
			result += s;
			s++;
		}
		return result;
	}
}