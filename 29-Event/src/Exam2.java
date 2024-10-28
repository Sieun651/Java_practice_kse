// 이벤트.상속
//Listener 또는 Adapter를 바로 상속받음
//(이벤트 처리 클래스(113p 객체정의유형 2번))

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Event2 extends Frame implements ActionListener {
	Button button = new Button("확인");

	public Event2() {
		// Frame 기본 설정
		setSize(300, 200);
		setTitle("Event");
		setLocation(800,500);
		init();	//화면구성
		start();//이벤트설정
		setVisible(true);
	}
	private void init() {		
		//레이아웃 설정
		setLayout(null);
		add(button);
		//버튼설정
		button.setBackground(Color.YELLOW);
		button.setBounds(110, 95, 80, 30);
	}
	private void start() {		
		button.addActionListener(this);		// start(Event2 this)
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	
}
public class Exam2 {
	public static void main(String[] args) {
		new Event2();
	}		
}
