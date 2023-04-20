package network;

public class Thread4 {
	// 멀티 스레드 응용편
	static int money = 50000; // 초기 통장 잔고
	public static void main(String[] args) {
		
		Thread out = new Outcome();
		out.start();

		Runnable run = new Income();
		Thread thread = new Thread(run);
		thread.start();
	}
}
class Income implements Runnable { // 입금용
	@Override
	public void run() {
		int in = 30000;
		Thread4.money +=  in;
		System.out.println("현재 통장 잔액은 "+Thread4.money+"원입니다.");
	}
}
class Outcome extends Thread{ // 출금용
	public void run() {
		int[] out = {15000,25000,16000};
		for(int i : out) {
			Thread4.money -= i;
			System.out.println("현재 통장 잔액은 "+Thread4.money+"원입니다.");
		}
	}
}