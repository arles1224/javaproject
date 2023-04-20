package network;

public class Thread1 {

	public static void main(String[] args) {
		int w = 0;
		while(w < 6) {
			Box box = new Box(w);
			// 멀티 스레드.
			Thread thread = new Thread(box);
			thread.start(); // run 메소드를 실행하는 메소드
			// 작업이 먼저 끝난 순서대로 작동한다.
			w++;
		}
	}
}
class Box extends Thread{
	int no;
	public Box(int a) {
		this.no = a;
	}
	@Override
	public void run() {
		super.run();
		System.out.println(this.no);
	}
}