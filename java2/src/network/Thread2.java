package network;

public class Thread2 {
	// 멀티 스레드를 사용할 수 있다는 것이 자바의 최고의 강점이다.
	public static void main(String[] args) {
		String[] user1 = {"hong","kim","park","jang","han"};
		String[] user2= {"lee","yoon","hwang","jo","ko"};
		
		Listprint lp = new Listprint();
		
		for(int i=0;i<user1.length;i++) {
			String result = lp.view(user1[i]);
			System.out.println(result);
		}
		for(int i=0;i<user2.length;i++) {
			String result = lp.view(user2[i]);
			System.out.println(result);
		}
		
		// 멀티 Thread 반복문
		Listprint2 lp2;
		Listprint2 lp3;
		Thread th;
		Thread th2;
		for(int i=0;i<user1.length;i++) {
			lp2 = new Listprint2(user1[i]); // 객체 생성 후 메소드로 데이터 전달
			lp3 = new Listprint2(user2[i]);
			th = new Thread(lp2); // Thread 이용해 해당 데이터 처리
			th2 = new Thread(lp3);
			th.start(); // 각 Thread 작동시킴
			th2.start();
		}
		
		Thread tt1;
		Thread tt2;
		Thread tt3;
		Thread tt4;
		
		try {
			for(int i=0;i<user1.length;i++) {
				lp2 = new Listprint2(user1[i]);
				tt1 = new Thread(lp2);
				tt2 = new Thread(lp2);
				tt3 = new Thread(lp2);
				tt4 = new Thread(lp2);
				tt1.start(); // 멀티 스레드로 작업 시작
				tt1.join(); // 작업 종료 순서와 관계 없이 순차적으로 결과가 나오도록 한다.
				tt2.start();
				tt2.join();
				tt3.start();
				tt4.start();
			}
		}catch(Exception e) {
			
		}
		
	}
}
// 단일 Thread
class Listprint{
	public String view(String data) {		
		return data;
	}
}
// 멀티 Thread
class Listprint2 extends Thread {
	String usernm;
	public Listprint2(String usernm) {
		this.usernm = usernm;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println("스레드 오류");
		}
		System.out.println(this.usernm);
	}
	
}
// 멀티 Thread 사용법2
class Listprint3 implements Runnable{
	@Override
	public void run() {		
	}
}