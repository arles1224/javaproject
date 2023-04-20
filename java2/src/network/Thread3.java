package network;

public class Thread3 {
	// 멀티 스레드 간편 코드 양식
	public static void main(String[] args) {
		Thread thread = new Cpus();
		thread.start();
		int sum = 0;
		for(int i = 1;i<=10;i++) {
			sum += i;
			System.out.println(sum+" : main 메소드 데이터");
		}
		
		Runnable run = new Amds();
		Thread th = new Thread(run);
		th.start();
		
	}
}
// implements
class Amds implements Runnable{
	@Override
	public void run() {
		int sum = 0;
		for(int i = 1;i<=10;i++) {
			sum += i;
			System.out.println(sum+" : Implements 데이터");
		}
	}
}
// extends
class Cpus extends Thread{
	@Override
	public void run() {
		int sum = 0;
		for(int i = 1;i<=10;i++) {
			sum += i;
			System.out.println(sum+" : Extends 데이터");
		}
	}
}