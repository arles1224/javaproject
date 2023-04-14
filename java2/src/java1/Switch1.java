package java1;

public class Switch1 {

	public static void main(String[] args) {
		//switch문
		int a = 10;
		switch(a) {
		case 1:
		case 10: //멀티 케이스
			System.out.print("옵션 1 선택.");
			break;
		case 2:
			System.out.print("옵션 2 선택.");
			break;
		case 3:
			System.out.print("옵션 3 선택.");
			break;
		case 4:
			System.out.print("옵션 4 선택.");
			break;
		default:
			System.out.print("옵션 값이 잘못되었습니다.");
			break;
		}

	}

}
