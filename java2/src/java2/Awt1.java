//package java2;
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//public class Awt1 {
//	// java => awt, swing(GUI 프로그램) : 옛날 프로그램들. 요즘 실무에서는 안드로이드 스튜디오 쓴다.
//	/*
//	 * awt 생성 방식
//	 * Frame 생성 -> Panel 생성 -> Object 생성
//	 * awt 적용 방식
//	 * Object -> Panel -> Frame
//	 */
//	public static void main(String[] args) {
//		// 프레임 생성
//		Frame frame = new Frame();
//		Closepm closepm = new Closepm();
//		frame.setTitle("사용자 로그인"); // 창 타이틀
//		frame.setSize(500,500); // 창 사이즈
//		frame.setVisible(true); // 창 사용 여부
//		frame.addWindowListener(closepm); // 창닫기 기능
//		
//		//패널 생성
//		Panel panel = new Panel();
//		
//		// 오브젝트 생성
//		Checkbox c1 = new Checkbox("Auto Login");
//		TextField id = new TextField(10);
//		Button btn = new Button("login");
//		Button btn2 = new Button("close");
//		Button btn3 = new Button("auto ID");
//		
//		btn.setBackground(Color.yellow); // 배경 색상
//		// addActionListner : 버튼 클릭 시 핸들링 메소드
//		btn2.addActionListener(new ActionListener() { // 닫기 버튼
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		});
//		btn3.addActionListener(new ActionListener() {
//			String userid = "hong";
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				id.setText(userid); // id 이름을 가진 오브젝트 안에 userid 값을 적용
//			}
//		});
//		
//		// 패널에 오브젝트 적용
//		panel.add(btn3);
//		panel.add(id);
//		panel.add(btn);
//		panel.add(btn2);
//		panel.add(c1);
//		
//		// 프레임에 패널 적용
//		frame.add(panel);
//	}
//}
//// 닫기 버튼
//class Closepm extends WindowAdapter{
//	@Override
//	public void windowClosing(WindowEvent e) {
//		super.windowClosing(e);
//		System.out.println("프로그램 종료");
//		System.exit(0);
//	}
//}