package java3;

import java.util.ArrayList;

public class Exception7 {
	// 예외처리 코드 테스트
	/*
	 * (주)우아한형제들
	 * 응용문제
	 * 데이터 : {"김민수",55,"김민재","민지현",48,"이세현","이수정",34,88};
	 * 해당 데이터값 중 문자만 출력되도록 하시오.
	 * 단 메인에서는 해당 배열을 외부 클래스(setter)로 전송해야합니다.
	 * 해당 setter에서 배열값을 확인해 조건에 맞는 배열을 생성하고 getter에서 return으로 생성한 배열을 보냅니다.
	 * 외부클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
	 */
	public static void main(String[] args) {
		Object[] data  = {"김민수",55,"김민재","민지현",48,"이세현","이수정",34,88};
		Exc7 exc7 = new Exc7();
		try {
			exc7.setter(data);
			ArrayList<String> name = exc7.getter();
			System.out.println(name);
			
		}catch(Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e.getMessage());
			}
		}
	}

}
class Exc7{
	ArrayList<String> name = new ArrayList<>();
	public void setter(Object[] data) throws Exception {
		int i;
		int count = 0;
		for(i=0;i<data.length;i++) {
			if((String)data[i].getClass().getName() != "java.lang.Integer") {
				this.name.add((String)data[i]);
				count++;
			}
		}
		if(count == 0) {
			throw new Exception("숫자만 있는 배열입니다.");
		}
	}
	public ArrayList<String> getter() {
		return this.name;
	}
}