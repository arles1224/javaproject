package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer {
	// 멀티 채팅 서버
	public static void main(String[] args){
		MultiServer ms = new MultiServer();
		ms.info();
	}
	public void info() {
		ServerSocket ss; // 서버 소켓 클래스 로드
		Socket sk; // 소켓 클래스 로드
		try {
			ss = new ServerSocket(10001); // 서버 포트 오픈
			while(true) { // 사용자가 추가될 때마다 멀티 스레드를 작동시킴
				System.out.println("Chatroom Start");
				sk = ss.accept(); // 연결 유지 (반복문 필수)
				ChServer ch = new ChServer(sk); // 즉시 실행 메소드 호출하면서 소켓 전달
				ch.start(); // 멀티 스레드 호출
			}
		}catch(Exception e) {
			System.out.println("Server Socket Error : "+e);
		}
	}
}
class ChServer extends Thread{
	static ArrayList<PrintWriter> user = new ArrayList<>(); // 사용자 정보 저장. static 필수. 메모리에 미등록시 초기화됨.
	InputStreamReader isr;
	BufferedReader br = null;
	Socket sk;
	PrintWriter pw;
	
	public ChServer(Socket s) { // setter; 기본 옵션 모두 세팅
		this.sk = s; // 소켓을 필드값으로 전달
		try { // 모든 필드값에 속성값을 전달
			this.pw = new PrintWriter(this.sk.getOutputStream()); // 쓰기
			this.br = new BufferedReader(new InputStreamReader(this.sk.getInputStream())); // 읽은 후에 Reader로 byte를 String으로 변경하고 메모리에 저장.
			user.add(this.pw); // 배열에 사용자 추가
		}catch(Exception e) {
			System.out.println("Socket Error");
		}
	}

	@Override
	public void run() { // 스레드 작동
		String name = "";
		try {
			name = this.br.readLine();
			// System.out.println("["+name+"]"); // 접속자 출력
			info("["+name+"] Welcome"); // 클라이언트에게 환영 메세지 최초 한 번만 출력
			
			while(this.br != null) { // 클라이언트 입력한 메세지를 배열에 있는 전체 클라이언트들에게 전달.
				String inmsg = this.br.readLine();
				if(inmsg.equals("exit")) { // 클라이언트가 exit 입력 시 반복문 종료
					user.remove(this.pw);
					info(name + " [has leaved]");
					break;
				}else {
					info(name + " : "+inmsg);
				}
			}
		}catch(Exception e) {
			System.out.println("User ID Error");
		}
	}
	
	public void info(String s) { // 전달
		for(PrintWriter p : user) { // 접속한 사용자만큼 반복
			p.println(s); // 메세지 전달
			p.flush(); // 메모리 초기화
		}
	}
}