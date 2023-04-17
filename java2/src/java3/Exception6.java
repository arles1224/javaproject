package java3;

public class Exception6 {
	// 아이디 중복 체크 프로세스
	public static void main(String[] args) {
		Idcheck idcheck = new Idcheck();
		try {
			String callsign = idcheck.id_result("hong"); //AJAX로 아이디를 받는 상황
			System.out.println(callsign);
		}catch(Exception e) { // Idcheck 클래스에서 오류가 발생했을 경우
			if(e.getMessage()!=null) {
				System.err.println(e);
			}
		}
		
	}

}
class Idcheck{
	public String id_result(String mid) throws Exception {
		String call; // 프론트엔드에게 출력하는 메세지용 변수
		if(mid == null || mid.equals("")) {
			throw new Exception("error"); // 값이 비어있거나 없을 경우 예외 발생
		}else {
			if(mid.equals("hong")){ // 동일한 아이디가 있는 경우를 상정한 코드
				call = "no";
			}else { // 동일한 아이디가 없는 경우를 상정한 코드
				call = "yes";
			}
		}
		return call;
	}
}