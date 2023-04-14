package java2;

public class Method6 {
	// 배열 데이터를 이용해 총 홀수값 개수 받기
	public static void main(String[] args) {
		mysql m = new mysql();
		String number = m.check("홀수");
		System.out.printf("총 개수는 %s입니다.",number);
		
		//String number2 = m.check("짝수");
		//System.out.printf("\n총 개수는 %s입니다.",number2);
	}

}
// data 내용 15 22 17 14 32 35 19 33
class mysql{
	// 응용문제 1.
	// 협업 프로그래머가 위의 DB 값 중 홀수값이 총 몇 개인지를 받고자 합니다.
	// 해당 개수를 출력하는 코드를 작성하시오.
	
	private int[] array = {15,22,17,14,32,35,19,33};
	private int count;
	String check(String type) {
		this.count = 0;
		int ea = array.length, w = 0, n = 0;
		if(type == "홀수") {
			n = 1;
		}
		while(w < ea) {
			if(array[w]%2==n) {
				count++;
			}
			w++;
		}
		String result = count + "개";
		return result;
	}
	/*
	 * private int data[];
	 * public String check(String order){
	 * int numbers[] = {15,22,17,14,32,35,19,33};
	 * this.data = numbers;
	 * int count = 0;
	 * 	if(order.equals("홀수")){
	 * 		for(int f = this.data){
	 * 			if(f%2 == 1){
	 * 				count++;
	 * 			}
	 * 		}
	 * 	}
	 * 	return Integer.toString(count);
	 * }
	 */
}