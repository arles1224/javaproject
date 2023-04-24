package network;

public class Thread5 {
	/*
	 * 멀티 스레드 응용문제 1.
	 * 멀티 스레드를 이용해 각 구구단을 출력하는 프로세스를 제작하시오.
	 * 첫 번째 스레드는 구구단 5단을, 두 번째 스레드는 구구단 9단을 출력합니다.
	 */
	public static void main(String[] args) {
		Thread five = new Five();
		Thread nine = new Nine();
		five.start();
		nine.start();
	}

}
class Five extends Thread{
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			int sum = 5 * i;
			System.out.println("5 * "+i+" = "+sum);
		}
	}
}
class Nine extends Thread{
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			int sum = 9 * i;
			System.out.println("9 * "+i+" = "+sum);
		}
	}
}