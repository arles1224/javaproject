package java2;

public class Sleep {
	// 시간 타이머
	public static void main(String[] args) {
		try {
			// Thread : 프로세스가 실질적으로 작업하는 단위.
			int w = 0;
			while(w < 101) {
				Thread.sleep(1000); // 작업을 1초동안 중지해라.
				w++;
				System.out.println(w); // 1초에 한 번 씩 출력된다.
				if(w >= 60) {
					w = 0;
				}
			}
		}catch(Exception e) {
			
		}
	}

}
