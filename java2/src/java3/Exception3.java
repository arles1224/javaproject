package java3;

import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
		// 배열 값의 총 합계를 구하시오
		String[] data = {"2,000","2,500","3,000","500","4,500"};
		Method2 method2 = new Method2();
		try {			
			method2.total1_method(data);
		}catch(Exception e) {
			System.out.println("해당 데이터는 합산이 불가능합니다.");
		}finally {
//			ArrayList<String> rdata = new ArrayList<>();
//			int i;
//			for(i=0;i<data.length;i++) {
//				rdata.add(data[i].replaceAll(",",""));
//			}
//			System.out.println(rdata);
			// method2.total1_method(rdata); // 원시 배열로 받으면 List와 Map로는 못 보낸다.
			try {
				String[] rdata = new String[data.length];
				int i;
				for(i=0;i<data.length;i++) {
					rdata[i] = data[i].replaceAll(",", "");
				}
				method2.total1_method(rdata);
			}catch(Exception e) {
				e.getMessage(); // catch에는 System.out.print를 사용하지 않는다.
			}
		}
		
	}
}
class Method2{
	public void total1_method(String[] db) throws Exception {
		System.out.println(Arrays.toString(db));
		int ea = db.length;
		int i;
		int sum = 0;
		for(i=0; i<ea; i++ ) {
			sum += Integer.valueOf(db[i]);
		}
		System.out.println(sum);
		Exception ex = new Exception();
		throw ex;
	}
}