package network;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Scanner;

public class Net2 {
	// Port : 접속하는 경로
	// TCP Port
	// 80 : 웹(http://)
	// 443 : 웹(https://)
	// 21 : FTP
	// 22 : SSH
	// 23 : telnet
	// 25 : SMTP(메일 보내기)
	// 110 : POP3(메일 받기) - 서버와 비동기화
	// 143 : IMAP (메일 받기) - 서버와 동기화
	
	// UDP Port
	// SNMP : 문자 발송 시스템
	// VPN : 가상 아이피
	public static void main(String[] args) {
		try {
			GetImage getimage = new GetImage();
			getimage.img();
		}catch(Exception e) {
			System.out.println("통신오류발생");
		}
	}

}
class GetImage {
	Scanner scanner;
	InputStream is;
	BufferedInputStream bi;
	FileOutputStream fs;
	public void img() throws Exception {
		this.scanner = new Scanner(System.in);
		System.out.println("이미지 주소를 입력해주세요.");
		String url = scanner.nextLine();
		URL u = new URL(url); // URL 클래스 : 네트워크 경로(절대경로)
		URLConnection con = u.openConnection(); // 해당 경로를 연결
		System.out.println(con);
		
		int imgsize = con.getContentLength(); // 이미지 크기
		System.out.println(imgsize);
		String imgtype = con.getContentType(); // 이미지 형태
		System.out.println(imgtype);
		// long date = con.getDate(); // 파일 업로드 날짜
		
		this.is = u.openStream(); // 통신에서는 openStream 메소드만 사용할 수 있다.
		this.bi = new BufferedInputStream(this.is); // 버퍼에 이미지 파일을 임시로 저장
		byte[] data = new byte[1024]; // 파일을 다운받을 크기 지정
		Date today = new Date();
		String filename = today.getTime() +".jpg";
		this.fs = new FileOutputStream("E:\\memo\\"+filename); // 빈 파일을 해당 경로에 생성
		int imgdata = 0;
		int count = 0;
		while((imgdata=this.bi.read(data))!= -1) { // 파일 다운이 끝날 때까지 반복
			this.fs.write(data,0,imgdata); // 파일 다운
			count += imgdata;
			System.out.println("다운로드 중..."+(count*100/imgsize)+"%");
		}
		System.out.println("다운로드 완료");
		this.fs.flush(); // 메모리 비움
		this.fs.close();
		this.is.close();
		this.bi.close();
		this.scanner.close();
		
	}
}