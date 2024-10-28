// Frame 클래스 >> 상속

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

class Form3 extends Frame {
	Button button = new Button("확인");
	
	
	public Form3() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("기본 화면");
		setLocation(800, 400);
		init();		// 화면 구성
		start(); 	// 이벤트 설정
		
		setVisible(true);
	}
	// 화면 구성
	private void init() {
		// 레이아웃 설정
		setLayout(null);
		add(button);
		
		// button 설정
		button.setBackground(Color.YELLOW);
		button.setBounds(110, 95, 80, 30);
	}
	// 이벤트 설정
	private void start() {
		
	}
}

public class Exam3 {
	public static void main(String[] args) {
		new Form3();
	}
}
