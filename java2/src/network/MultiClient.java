package network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MultiClient {
	// 멀티 채팅 클라이언트
	public static void main(String[] args) {
		MultiClient mc = new MultiClient();
		mc.info();
	}
	public void info() {
		Socket sk;
		BufferedReader br = null;
		InputStream is;
		InputStreamReader isr;
		Scanner scanner;
		try {
			sk = new Socket("192.168.10.148",10001); // 서버 접속 ip와 포트 설정
			System.out.println("Sever Connection Successed");
			scanner = new Scanner(System.in);
			System.out.println("User ID : "); // 사용자 ID
			String name = scanner.next();
			// 멀티 스레드로 사용자 아이디 및 소켓 전달
			Thread tr = new ChClient(sk,name);
			tr.start(); // 멀티 스레드 호출
			
			is = sk.getInputStream(); // 읽기
			isr = new InputStreamReader(is); // byte를 String으로 변환
			br = new BufferedReader(isr); // 메모리에 저장
			
			while(br != null) {
				String msg = br.readLine(); // 메모리 문자 확인
				System.out.println(msg); // 메세지 전달
			}
		}catch(Exception e) {
			System.out.println("Server Connection Error : " + e);
		}
	}
}
class ChClient extends Thread{
	Socket sk;
	String name;
	Scanner scanner;
	public ChClient(Socket s, String name) { // setter. 소켓과 아이디 값을 기본 설정으로 등록
		this.sk = s;
		this.name = name;
	}
	@Override
	public void run() {
		try {
			PrintWriter ps = new PrintWriter(this.sk.getOutputStream()); // byte를 String으로 변환
			ps.println(this.name); // 최초 입장 시에만 사용
			ps.flush();
			
			while(true) { // 사용자가 입력한 메세지를 서버에 전달
				this.scanner = new Scanner(System.in);
				String msg = this.scanner.nextLine();
				ps.println(msg); // 전달 메세지 출력
				ps.flush(); // 메모리 초기화
				if(msg.equals("exit")) {
					System.out.println("Chatting has ended");
					System.exit(0);
					this.scanner.close();
					break;
				}
			}
		}catch(Exception e) {
			System.out.println("Message Error : "+e);
		}
	}
}